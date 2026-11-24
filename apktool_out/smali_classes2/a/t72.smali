.class public final synthetic La/t72;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Z

.field public final synthetic d:F

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:La/wdr;


# direct methods
.method public synthetic constructor <init>(La/mm40;FLkotlin/jvm/functions/Function0;ZLa/vj50;La/y72;Lkotlin/jvm/functions/Function2;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/t72;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/t72;->b:La/mm40;

    iput p2, p0, La/t72;->d:F

    iput-object p3, p0, La/t72;->e:Ljava/lang/Object;

    iput-boolean p4, p0, La/t72;->c:Z

    iput-object p5, p0, La/t72;->f:Ljava/lang/Object;

    iput-object p6, p0, La/t72;->g:Ljava/lang/Object;

    iput-object p7, p0, La/t72;->h:La/wdr;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/nhe;ZLa/bdz;FLa/bzl;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    const/4 p8, 0x1

    iput-byte p8, p0, La/t72;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/t72;->b:La/mm40;

    iput-object p2, p0, La/t72;->e:Ljava/lang/Object;

    iput-boolean p3, p0, La/t72;->c:Z

    iput-object p4, p0, La/t72;->f:Ljava/lang/Object;

    iput p5, p0, La/t72;->d:F

    iput-object p6, p0, La/t72;->g:Ljava/lang/Object;

    iput-object p7, p0, La/t72;->h:La/wdr;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/t72;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/t72;->h:La/wdr;

    .line 6
    .line 7
    iget-object v3, v0, La/t72;->g:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/t72;->f:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/t72;->e:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object v7, v5

    .line 17
    check-cast v7, La/nhe;

    .line 18
    .line 19
    move-object v9, v4

    .line 20
    check-cast v9, La/bdz;

    .line 21
    .line 22
    move-object v11, v3

    .line 23
    check-cast v11, La/bzl;

    .line 24
    .line 25
    move-object v12, v2

    .line 26
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    move-object/from16 v13, p1

    .line 29
    .line 30
    check-cast v13, La/fet;

    .line 31
    .line 32
    move-object/from16 v1, p2

    .line 33
    .line 34
    check-cast v1, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x7

    .line 40
    invoke-static {v1}, La/x8x;->L(I)I

    .line 41
    .line 42
    .line 43
    move-result v14

    .line 44
    iget-object v6, v0, La/t72;->b:La/mm40;

    .line 45
    .line 46
    iget-boolean v8, v0, La/t72;->c:Z

    .line 47
    .line 48
    iget v10, v0, La/t72;->d:F

    .line 49
    .line 50
    invoke-static/range {v6 .. v14}, La/nnw0;->p(La/mm40;La/nhe;ZLa/bdz;FLa/bzl;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_0
    move-object v6, v5

    .line 57
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 58
    .line 59
    move-object v8, v4

    .line 60
    check-cast v8, La/vj50;

    .line 61
    .line 62
    move-object v9, v3

    .line 63
    check-cast v9, La/y72;

    .line 64
    .line 65
    move-object v12, v2

    .line 66
    check-cast v12, Lkotlin/jvm/functions/Function2;

    .line 67
    .line 68
    move-object/from16 v13, p1

    .line 69
    .line 70
    check-cast v13, La/fet;

    .line 71
    .line 72
    move-object/from16 v1, p2

    .line 73
    .line 74
    check-cast v1, Ljava/lang/Integer;

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    and-int/lit8 v2, v1, 0x3

    .line 81
    .line 82
    const/4 v3, 0x2

    .line 83
    const/4 v4, 0x1

    .line 84
    if-eq v2, v3, :cond_0

    .line 85
    .line 86
    move v2, v4

    .line 87
    goto :goto_0

    .line 88
    :cond_0
    const/4 v2, 0x0

    .line 89
    :goto_0
    and-int/2addr v1, v4

    .line 90
    invoke-virtual {v13, v1, v2}, La/fet;->U(IZ)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_1

    .line 95
    .line 96
    const/16 v17, 0x0

    .line 97
    .line 98
    const/16 v19, 0x7

    .line 99
    .line 100
    iget-object v14, v0, La/t72;->b:La/mm40;

    .line 101
    .line 102
    const/4 v15, 0x0

    .line 103
    const/16 v16, 0x0

    .line 104
    .line 105
    iget v1, v0, La/t72;->d:F

    .line 106
    .line 107
    move/from16 v18, v1

    .line 108
    .line 109
    invoke-static/range {v14 .. v19}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    const/high16 v2, 0x3f800000    # 1.0f

    .line 114
    .line 115
    invoke-static {v1, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    sget-object v2, La/qmk;->a:La/zcl;

    .line 120
    .line 121
    const/high16 v2, 0x43520000    # 210.0f

    .line 122
    .line 123
    invoke-static {v1, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    const/4 v5, 0x0

    .line 128
    const/16 v7, 0x1c

    .line 129
    .line 130
    const/4 v2, 0x0

    .line 131
    const/4 v3, 0x0

    .line 132
    const/4 v4, 0x0

    .line 133
    invoke-static/range {v1 .. v7}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iget-boolean v0, v0, La/t72;->c:Z

    .line 138
    .line 139
    invoke-static {v1, v0, v8}, La/fww;->z(La/mm40;ZLa/vj50;)La/mm40;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    check-cast v9, La/x72;

    .line 144
    .line 145
    iget-object v11, v9, La/x72;->a:La/n3n;

    .line 146
    .line 147
    const/4 v14, 0x0

    .line 148
    const/4 v15, 0x0

    .line 149
    invoke-static/range {v10 .. v15}, La/rsr0;->r(La/mm40;La/n3n;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_1
    invoke-virtual {v13}, La/fet;->X()V

    .line 154
    .line 155
    .line 156
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    return-object v0

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
