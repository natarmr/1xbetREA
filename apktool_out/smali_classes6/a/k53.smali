.class public final synthetic La/k53;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BIILa/wdr;La/mm40;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/k53;->a:B

    iput-object p5, p0, La/k53;->b:Ljava/lang/Object;

    iput-object p6, p0, La/k53;->e:Ljava/lang/Object;

    iput-object p7, p0, La/k53;->f:Ljava/lang/Object;

    iput p2, p0, La/k53;->c:I

    iput-object p4, p0, La/k53;->g:Ljava/lang/Object;

    iput p3, p0, La/k53;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/kwj;ILa/i4;La/pv40;La/aig;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/k53;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/k53;->b:Ljava/lang/Object;

    iput p2, p0, La/k53;->c:I

    iput-object p3, p0, La/k53;->e:Ljava/lang/Object;

    iput-object p4, p0, La/k53;->f:Ljava/lang/Object;

    iput-object p5, p0, La/k53;->g:Ljava/lang/Object;

    iput p6, p0, La/k53;->d:I

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/a4x;ILa/gna0;Lkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 3
    const/4 v0, 0x3

    iput-byte v0, p0, La/k53;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/k53;->b:Ljava/lang/Object;

    iput-object p2, p0, La/k53;->e:Ljava/lang/Object;

    iput p3, p0, La/k53;->c:I

    iput-object p4, p0, La/k53;->f:Ljava/lang/Object;

    iput-object p5, p0, La/k53;->g:Ljava/lang/Object;

    iput p6, p0, La/k53;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/k53;->a:B

    .line 2
    .line 3
    iget v1, p0, La/k53;->d:I

    .line 4
    .line 5
    iget-object v2, p0, La/k53;->g:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/k53;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, La/k53;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, p0, La/k53;->b:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object v6, v5

    .line 17
    check-cast v6, La/mm40;

    .line 18
    .line 19
    move-object v7, v4

    .line 20
    check-cast v7, La/a4x;

    .line 21
    .line 22
    move-object v9, v3

    .line 23
    check-cast v9, La/gna0;

    .line 24
    .line 25
    move-object v10, v2

    .line 26
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    move-object v11, p1

    .line 29
    check-cast v11, La/fet;

    .line 30
    .line 31
    move-object/from16 v0, p2

    .line 32
    .line 33
    check-cast v0, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    or-int/lit8 v0, v1, 0x1

    .line 39
    .line 40
    invoke-static {v0}, La/x8x;->L(I)I

    .line 41
    .line 42
    .line 43
    move-result v12

    .line 44
    iget v8, p0, La/k53;->c:I

    .line 45
    .line 46
    invoke-static/range {v6 .. v12}, La/bww;->h(La/mm40;La/a4x;ILa/gna0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_0
    move-object v0, v5

    .line 53
    check-cast v0, La/kwj;

    .line 54
    .line 55
    check-cast v4, La/i4;

    .line 56
    .line 57
    check-cast v3, La/pv40;

    .line 58
    .line 59
    check-cast v2, La/aig;

    .line 60
    .line 61
    move-object v5, p1

    .line 62
    check-cast v5, La/fet;

    .line 63
    .line 64
    move-object/from16 v6, p2

    .line 65
    .line 66
    check-cast v6, Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    or-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    invoke-static {v1}, La/x8x;->L(I)I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    iget v1, p0, La/k53;->c:I

    .line 78
    .line 79
    move-object v13, v4

    .line 80
    move-object v4, v2

    .line 81
    move-object v2, v13

    .line 82
    invoke-static/range {v0 .. v6}, La/xbc;->h(La/kwj;ILa/i4;La/pv40;La/aig;La/fet;I)V

    .line 83
    .line 84
    .line 85
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_1
    move-object v0, v5

    .line 89
    check-cast v0, La/mm40;

    .line 90
    .line 91
    check-cast v4, La/fop0;

    .line 92
    .line 93
    check-cast v3, La/a4x;

    .line 94
    .line 95
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 96
    .line 97
    move-object v5, p1

    .line 98
    check-cast v5, La/fet;

    .line 99
    .line 100
    move-object/from16 v6, p2

    .line 101
    .line 102
    check-cast v6, Ljava/lang/Integer;

    .line 103
    .line 104
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    or-int/lit8 v1, v1, 0x1

    .line 108
    .line 109
    invoke-static {v1}, La/x8x;->L(I)I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    move-object v1, v4

    .line 114
    move-object v4, v2

    .line 115
    move-object v2, v3

    .line 116
    iget v3, p0, La/k53;->c:I

    .line 117
    .line 118
    invoke-static/range {v0 .. v6}, La/ffb0;->e(La/mm40;La/fop0;La/a4x;ILkotlin/jvm/functions/Function1;La/fet;I)V

    .line 119
    .line 120
    .line 121
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object p0

    .line 124
    :pswitch_2
    move-object v0, v5

    .line 125
    check-cast v0, La/mm40;

    .line 126
    .line 127
    check-cast v4, La/p53;

    .line 128
    .line 129
    check-cast v3, La/t6k;

    .line 130
    .line 131
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 132
    .line 133
    move-object v5, p1

    .line 134
    check-cast v5, La/fet;

    .line 135
    .line 136
    move-object/from16 v6, p2

    .line 137
    .line 138
    check-cast v6, Ljava/lang/Integer;

    .line 139
    .line 140
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    or-int/lit8 v1, v1, 0x1

    .line 144
    .line 145
    invoke-static {v1}, La/x8x;->L(I)I

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    iget p0, p0, La/k53;->c:I

    .line 150
    .line 151
    move-object v1, v4

    .line 152
    move-object v4, v2

    .line 153
    move-object v2, v3

    .line 154
    move v3, p0

    .line 155
    invoke-static/range {v0 .. v6}, La/nia0;->h(La/mm40;La/p53;La/t6k;ILkotlin/jvm/functions/Function0;La/fet;I)V

    .line 156
    .line 157
    .line 158
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    return-object p0

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
