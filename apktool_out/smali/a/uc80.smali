.class public final synthetic La/uc80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mdm;


# direct methods
.method public synthetic constructor <init>(La/mdm;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uc80;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/uc80;->b:La/mdm;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/uc80;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x10

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, La/g9z;

    .line 15
    .line 16
    move-object/from16 v9, p2

    .line 17
    .line 18
    check-cast v9, La/fet;

    .line 19
    .line 20
    move-object/from16 v5, p3

    .line 21
    .line 22
    check-cast v5, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    and-int/lit8 v1, v5, 0x11

    .line 32
    .line 33
    if-eq v1, v3, :cond_0

    .line 34
    .line 35
    move v2, v4

    .line 36
    :cond_0
    and-int/lit8 v1, v5, 0x1

    .line 37
    .line 38
    invoke-virtual {v9, v1, v2}, La/fet;->U(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    const/16 v10, 0x180

    .line 45
    .line 46
    const/16 v11, 0x9

    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    iget-object v6, v0, La/uc80;->b:La/mdm;

    .line 50
    .line 51
    const/4 v7, 0x1

    .line 52
    const/4 v8, 0x0

    .line 53
    invoke-static/range {v5 .. v11}, La/jcb;->l(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {v9}, La/fet;->X()V

    .line 58
    .line 59
    .line 60
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object v0

    .line 63
    :pswitch_0
    move-object/from16 v1, p1

    .line 64
    .line 65
    check-cast v1, La/ir8;

    .line 66
    .line 67
    move-object/from16 v14, p2

    .line 68
    .line 69
    check-cast v14, La/fet;

    .line 70
    .line 71
    move-object/from16 v5, p3

    .line 72
    .line 73
    check-cast v5, Ljava/lang/Integer;

    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    and-int/lit8 v1, v5, 0x11

    .line 83
    .line 84
    if-eq v1, v3, :cond_2

    .line 85
    .line 86
    move v2, v4

    .line 87
    :cond_2
    and-int/lit8 v1, v5, 0x1

    .line 88
    .line 89
    invoke-virtual {v14, v1, v2}, La/fet;->U(IZ)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_5

    .line 94
    .line 95
    sget-object v5, La/o7k0;->c:La/n0q;

    .line 96
    .line 97
    invoke-static {v14}, La/xfn;->a(La/fet;)La/wfn;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iget v1, v1, La/wfn;->c:F

    .line 102
    .line 103
    invoke-static {v14}, La/xfn;->a(La/fet;)La/wfn;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    iget v2, v2, La/wfn;->c:F

    .line 108
    .line 109
    const/16 v3, 0xa

    .line 110
    .line 111
    const/4 v4, 0x0

    .line 112
    invoke-static {v1, v4, v2, v4, v3}, La/s5x0;->u(FFFFI)La/lh80;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-static {v1, v14}, La/knm0;->g(La/hh80;La/fet;)La/ch80;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    sget-object v8, La/uc9;->e:La/nw3;

    .line 121
    .line 122
    iget-object v0, v0, La/uc80;->b:La/mdm;

    .line 123
    .line 124
    invoke-virtual {v14, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    if-nez v1, :cond_3

    .line 133
    .line 134
    sget-object v1, La/ukd;->a:La/cl5;

    .line 135
    .line 136
    if-ne v2, v1, :cond_4

    .line 137
    .line 138
    :cond_3
    new-instance v2, La/cd60;

    .line 139
    .line 140
    const/16 v1, 0x1a

    .line 141
    .line 142
    invoke-direct {v2, v0, v1}, La/cd60;-><init>(Ljava/lang/Object;B)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v14, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_4
    move-object v13, v2

    .line 149
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 150
    .line 151
    const/16 v15, 0x6000

    .line 152
    .line 153
    const/16 v16, 0x1ea

    .line 154
    .line 155
    const/4 v6, 0x0

    .line 156
    const/4 v9, 0x0

    .line 157
    const/4 v10, 0x0

    .line 158
    const/4 v11, 0x0

    .line 159
    const/4 v12, 0x0

    .line 160
    invoke-static/range {v5 .. v16}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_5
    invoke-virtual {v14}, La/fet;->X()V

    .line 165
    .line 166
    .line 167
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object v0

    .line 170
    nop

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
