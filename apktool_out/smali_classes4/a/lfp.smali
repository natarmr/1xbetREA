.class public final synthetic La/lfp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/s8p;


# direct methods
.method public synthetic constructor <init>(La/s8p;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lfp;->a:B

    iput-object p1, p0, La/lfp;->b:La/s8p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lfp;->a:B

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v0, v0, La/lfp;->b:La/s8p;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, La/k8z;

    .line 17
    .line 18
    move-object/from16 v11, p2

    .line 19
    .line 20
    check-cast v11, La/fet;

    .line 21
    .line 22
    move-object/from16 v5, p3

    .line 23
    .line 24
    check-cast v5, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    and-int/lit8 v1, v5, 0x11

    .line 34
    .line 35
    if-eq v1, v2, :cond_0

    .line 36
    .line 37
    move v3, v4

    .line 38
    :cond_0
    and-int/lit8 v1, v5, 0x1

    .line 39
    .line 40
    invoke-virtual {v11, v1, v3}, La/fet;->U(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-static {v11}, La/xfn;->a(La/fet;)La/wfn;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget v1, v1, La/wfn;->e:F

    .line 51
    .line 52
    invoke-static {v11}, La/xfn;->a(La/fet;)La/wfn;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget v2, v2, La/wfn;->d:F

    .line 57
    .line 58
    sub-float v4, v1, v2

    .line 59
    .line 60
    sget-object v1, La/qmk;->a:La/zcl;

    .line 61
    .line 62
    const/4 v7, 0x0

    .line 63
    const/16 v8, 0x8

    .line 64
    .line 65
    sget-object v3, La/jm40;->b:La/jm40;

    .line 66
    .line 67
    const/high16 v5, 0x41000000    # 8.0f

    .line 68
    .line 69
    move v6, v4

    .line 70
    invoke-static/range {v3 .. v8}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    new-instance v12, La/hjm;

    .line 75
    .line 76
    check-cast v0, La/h4t;

    .line 77
    .line 78
    iget-object v13, v0, La/h4t;->a:Ljava/lang/String;

    .line 79
    .line 80
    const/16 v24, 0x0

    .line 81
    .line 82
    const/16 v25, 0x1ffe

    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/4 v15, 0x0

    .line 86
    const/16 v16, 0x0

    .line 87
    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    const/16 v18, 0x0

    .line 91
    .line 92
    const/16 v19, 0x0

    .line 93
    .line 94
    const/16 v20, 0x0

    .line 95
    .line 96
    const/16 v21, 0x0

    .line 97
    .line 98
    const/16 v22, 0x0

    .line 99
    .line 100
    const/16 v23, 0x0

    .line 101
    .line 102
    invoke-direct/range {v12 .. v25}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 103
    .line 104
    .line 105
    sget-object v7, La/kjm;->a:La/kjm;

    .line 106
    .line 107
    move-object v6, v12

    .line 108
    const/16 v12, 0x180

    .line 109
    .line 110
    const/16 v13, 0x38

    .line 111
    .line 112
    const/4 v8, 0x0

    .line 113
    const/4 v9, 0x0

    .line 114
    const/4 v10, 0x0

    .line 115
    invoke-static/range {v5 .. v13}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    invoke-virtual {v11}, La/fet;->X()V

    .line 120
    .line 121
    .line 122
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object v0

    .line 125
    :pswitch_0
    move-object/from16 v1, p1

    .line 126
    .line 127
    check-cast v1, La/k8z;

    .line 128
    .line 129
    move-object/from16 v9, p2

    .line 130
    .line 131
    check-cast v9, La/fet;

    .line 132
    .line 133
    move-object/from16 v5, p3

    .line 134
    .line 135
    check-cast v5, Ljava/lang/Integer;

    .line 136
    .line 137
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    and-int/lit8 v1, v5, 0x11

    .line 145
    .line 146
    if-eq v1, v2, :cond_2

    .line 147
    .line 148
    move v3, v4

    .line 149
    :cond_2
    and-int/lit8 v1, v5, 0x1

    .line 150
    .line 151
    invoke-virtual {v9, v1, v3}, La/fet;->U(IZ)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_3

    .line 156
    .line 157
    check-cast v0, La/gun;

    .line 158
    .line 159
    iget-object v6, v0, La/gun;->a:La/mdm;

    .line 160
    .line 161
    const/16 v10, 0x180

    .line 162
    .line 163
    const/16 v11, 0x9

    .line 164
    .line 165
    const/4 v5, 0x0

    .line 166
    const/4 v7, 0x1

    .line 167
    const/4 v8, 0x0

    .line 168
    invoke-static/range {v5 .. v11}, La/jcb;->l(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_3
    invoke-virtual {v9}, La/fet;->X()V

    .line 173
    .line 174
    .line 175
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    return-object v0

    .line 178
    nop

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
