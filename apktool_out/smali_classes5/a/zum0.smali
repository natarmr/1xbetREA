.class public final synthetic La/zum0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:La/xdr;

.field public final synthetic b:La/pz40;

.field public final synthetic c:La/kz20;

.field public final synthetic d:La/mbh0;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:La/ugd;

.field public final synthetic g:La/ugd;

.field public final synthetic h:Z

.field public final synthetic i:La/cfq;


# direct methods
.method public synthetic constructor <init>(La/xdr;La/pz40;La/kz20;La/mbh0;Lkotlin/jvm/functions/Function1;La/ugd;La/ugd;ZLa/cfq;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/zum0;->a:La/xdr;

    iput-object p2, p0, La/zum0;->b:La/pz40;

    iput-object p3, p0, La/zum0;->c:La/kz20;

    iput-object p4, p0, La/zum0;->d:La/mbh0;

    iput-object p5, p0, La/zum0;->e:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, La/zum0;->f:La/ugd;

    iput-object p7, p0, La/zum0;->g:La/ugd;

    iput-boolean p8, p0, La/zum0;->h:Z

    iput-object p9, p0, La/zum0;->i:La/cfq;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/mm40;

    .line 6
    .line 7
    move-object/from16 v5, p2

    .line 8
    .line 9
    check-cast v5, La/fet;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v3, v2, 0x6

    .line 23
    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    const/4 v3, 0x4

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v3, 0x2

    .line 35
    :goto_0
    or-int/2addr v2, v3

    .line 36
    :cond_1
    and-int/lit8 v3, v2, 0x13

    .line 37
    .line 38
    const/16 v4, 0x12

    .line 39
    .line 40
    const/4 v9, 0x0

    .line 41
    if-eq v3, v4, :cond_2

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move v3, v9

    .line 46
    :goto_1
    and-int/lit8 v4, v2, 0x1

    .line 47
    .line 48
    invoke-virtual {v5, v4, v3}, La/fet;->U(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_5

    .line 53
    .line 54
    iget-object v11, v0, La/zum0;->a:La/xdr;

    .line 55
    .line 56
    iget-object v12, v0, La/zum0;->b:La/pz40;

    .line 57
    .line 58
    iget-object v13, v0, La/zum0;->c:La/kz20;

    .line 59
    .line 60
    iget-object v14, v0, La/zum0;->d:La/mbh0;

    .line 61
    .line 62
    iget-object v15, v0, La/zum0;->e:Lkotlin/jvm/functions/Function1;

    .line 63
    .line 64
    iget-object v3, v0, La/zum0;->f:La/ugd;

    .line 65
    .line 66
    iget-object v6, v0, La/zum0;->g:La/ugd;

    .line 67
    .line 68
    if-nez v11, :cond_4

    .line 69
    .line 70
    const v0, 0x18c30909

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5, v0}, La/fet;->e0(I)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Ljava/lang/Number;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    const/4 v4, -0x1

    .line 87
    if-ne v0, v4, :cond_3

    .line 88
    .line 89
    invoke-virtual {v5, v9}, La/fet;->r(Z)V

    .line 90
    .line 91
    .line 92
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object v0

    .line 95
    :cond_3
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Ljava/lang/Number;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    and-int/lit8 v8, v2, 0xe

    .line 106
    .line 107
    move v2, v0

    .line 108
    move-object v0, v1

    .line 109
    move-object v7, v5

    .line 110
    move-object v1, v13

    .line 111
    move-object v4, v15

    .line 112
    move-object v5, v3

    .line 113
    move-object v3, v14

    .line 114
    invoke-static/range {v0 .. v8}, La/cvm0;->b(La/mm40;La/kz20;ILa/mbh0;Lkotlin/jvm/functions/Function1;La/ugd;La/ugd;La/fet;I)V

    .line 115
    .line 116
    .line 117
    move-object v5, v7

    .line 118
    invoke-virtual {v5, v9}, La/fet;->r(Z)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_4
    move-object/from16 v16, v3

    .line 123
    .line 124
    move-object/from16 v17, v6

    .line 125
    .line 126
    const v3, 0x18caf8fd

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5, v3}, La/fet;->e0(I)V

    .line 130
    .line 131
    .line 132
    iget-boolean v3, v0, La/zum0;->h:Z

    .line 133
    .line 134
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    new-instance v10, La/us4;

    .line 139
    .line 140
    invoke-direct/range {v10 .. v17}, La/us4;-><init>(La/xdr;La/pz40;La/kz20;La/mbh0;Lkotlin/jvm/functions/Function1;La/ugd;La/ugd;)V

    .line 141
    .line 142
    .line 143
    const v4, 0x630d8763

    .line 144
    .line 145
    .line 146
    invoke-static {v4, v10, v5}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    shl-int/lit8 v2, v2, 0x3

    .line 151
    .line 152
    and-int/lit8 v2, v2, 0x70

    .line 153
    .line 154
    or-int/lit16 v6, v2, 0x6000

    .line 155
    .line 156
    const/16 v7, 0x8

    .line 157
    .line 158
    iget-object v2, v0, La/zum0;->i:La/cfq;

    .line 159
    .line 160
    move-object v0, v3

    .line 161
    const/4 v3, 0x0

    .line 162
    invoke-static/range {v0 .. v7}, La/jwb;->e(Ljava/lang/Object;La/mm40;La/cfq;Ljava/lang/String;La/ugd;La/fet;II)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v5, v9}, La/fet;->r(Z)V

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_5
    invoke-virtual {v5}, La/fet;->X()V

    .line 170
    .line 171
    .line 172
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object v0
.end method
