.class public final synthetic La/ium;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(IILa/mm40;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/ium;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, La/ium;->b:La/mm40;

    iput p1, p0, La/ium;->c:I

    iput p2, p0, La/ium;->d:I

    iput-boolean p4, p0, La/ium;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;IIZIB)V
    .locals 0

    .line 2
    iput-byte p6, p0, La/ium;->a:B

    iput-object p1, p0, La/ium;->b:La/mm40;

    iput p2, p0, La/ium;->c:I

    iput p3, p0, La/ium;->d:I

    iput-boolean p4, p0, La/ium;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/ium;->a:B

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    move-object v11, p1

    .line 8
    check-cast v11, La/fet;

    .line 9
    .line 10
    move-object/from16 v0, p2

    .line 11
    .line 12
    check-cast v0, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    and-int/lit8 v1, v0, 0x3

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    const/4 v3, 0x1

    .line 22
    if-eq v1, v2, :cond_0

    .line 23
    .line 24
    move v1, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    and-int/2addr v0, v3

    .line 28
    invoke-virtual {v11, v0, v1}, La/fet;->U(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    sget-object v0, La/m8m0;->a:La/zfn;

    .line 35
    .line 36
    invoke-virtual {v11, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 41
    .line 42
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite10-0d7_KjU()J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    invoke-virtual {v11, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 51
    .line 52
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite20-0d7_KjU()J

    .line 53
    .line 54
    .line 55
    move-result-wide v7

    .line 56
    invoke-virtual {v11, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 61
    .line 62
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 63
    .line 64
    .line 65
    move-result-wide v9

    .line 66
    const/4 v4, 0x0

    .line 67
    iget v2, p0, La/ium;->c:I

    .line 68
    .line 69
    iget v3, p0, La/ium;->d:I

    .line 70
    .line 71
    iget-object v12, p0, La/ium;->b:La/mm40;

    .line 72
    .line 73
    iget-boolean v13, p0, La/ium;->e:Z

    .line 74
    .line 75
    invoke-static/range {v2 .. v13}, La/ktt0;->a(IIIJJJLa/fet;La/mm40;Z)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    invoke-virtual {v11}, La/fet;->X()V

    .line 80
    .line 81
    .line 82
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_0
    move-object v4, p1

    .line 86
    check-cast v4, La/fet;

    .line 87
    .line 88
    move-object/from16 v0, p2

    .line 89
    .line 90
    check-cast v0, Ljava/lang/Integer;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-static {v1}, La/x8x;->L(I)I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    iget-object v0, p0, La/ium;->b:La/mm40;

    .line 100
    .line 101
    iget v1, p0, La/ium;->c:I

    .line 102
    .line 103
    iget v2, p0, La/ium;->d:I

    .line 104
    .line 105
    iget-boolean v3, p0, La/ium;->e:Z

    .line 106
    .line 107
    invoke-static/range {v0 .. v5}, La/f7k;->w(La/mm40;IIZLa/fet;I)V

    .line 108
    .line 109
    .line 110
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object p0

    .line 113
    :pswitch_1
    move-object v4, p1

    .line 114
    check-cast v4, La/fet;

    .line 115
    .line 116
    move-object/from16 v0, p2

    .line 117
    .line 118
    check-cast v0, Ljava/lang/Integer;

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-static {v1}, La/x8x;->L(I)I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    iget-object v0, p0, La/ium;->b:La/mm40;

    .line 128
    .line 129
    iget v1, p0, La/ium;->c:I

    .line 130
    .line 131
    iget v2, p0, La/ium;->d:I

    .line 132
    .line 133
    iget-boolean v3, p0, La/ium;->e:Z

    .line 134
    .line 135
    invoke-static/range {v0 .. v5}, La/f7k;->w(La/mm40;IIZLa/fet;I)V

    .line 136
    .line 137
    .line 138
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
