package com.github.fge.multiterator.primitives.ints.asis;

import com.github.fge.multiterator.primitives.ints.IntValuesSpliteratorBase;

public final class IntValuesSpliteratorAsIs
    extends IntValuesSpliteratorBase<IntValuesAsIs>
{
    private final int[] array;

    IntValuesSpliteratorAsIs(final int[] array, final int inputSize,
        final int windowSize, final boolean windowed)
    {
        super(inputSize, windowSize, windowed);
        this.array = array;
    }

    @Override
    protected IntValuesAsIs initialValue()
    {
        return new IntValuesAsIs(array, inputSize, windowSize);
    }
}