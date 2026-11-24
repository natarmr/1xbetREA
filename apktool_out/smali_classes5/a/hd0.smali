.class public final synthetic La/hd0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jd0;


# direct methods
.method public synthetic constructor <init>(La/jd0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hd0;->a:B

    iput-object p1, p0, La/hd0;->b:La/jd0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hd0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/hd0;->b:La/jd0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/jd0;->P1:La/gfk0;

    .line 11
    .line 12
    new-instance v1, La/q0h0;

    .line 13
    .line 14
    iget-object v0, v0, La/jd0;->L1:La/n0o0;

    .line 15
    .line 16
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, La/e7i;

    .line 21
    .line 22
    iget-object v0, v0, La/e7i;->p:La/n5d0;

    .line 23
    .line 24
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, La/d7i;

    .line 29
    .line 30
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_0
    sget-object v1, La/jd0;->P1:La/gfk0;

    .line 35
    .line 36
    sget-object v1, La/m8v;->a:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    iget-object v1, v0, La/jd0;->K1:La/khf0;

    .line 39
    .line 40
    sget-object v2, La/jd0;->Q1:[La/iiy;

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    aget-object v2, v2, v3

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Lorg/xplatform/search/impl/presentation/aggregator_brands/models/AggregatorBrandsFragmentSettings;

    .line 50
    .line 51
    iget-object v1, v1, Lorg/xplatform/search/impl/presentation/aggregator_brands/models/AggregatorBrandsFragmentSettings;->a:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v1}, La/m8v;->a(Ljava/lang/String;)La/g2v;

    .line 54
    .line 55
    .line 56
    move-result-object v16

    .line 57
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    instance-of v2, v1, La/af3;

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    if-eqz v2, :cond_0

    .line 72
    .line 73
    check-cast v1, La/af3;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    move-object v1, v3

    .line 77
    :goto_0
    const-class v2, La/kd0;

    .line 78
    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, La/o5d0;

    .line 90
    .line 91
    if-eqz v1, :cond_1

    .line 92
    .line 93
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, La/ze3;

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    move-object v1, v3

    .line 101
    :goto_1
    instance-of v4, v1, La/kd0;

    .line 102
    .line 103
    if-nez v4, :cond_2

    .line 104
    .line 105
    move-object v1, v3

    .line 106
    :cond_2
    check-cast v1, La/kd0;

    .line 107
    .line 108
    if-eqz v1, :cond_3

    .line 109
    .line 110
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget-object v4, v1, La/kd0;->f:La/fvt0;

    .line 118
    .line 119
    iget-object v5, v1, La/kd0;->i:La/pru;

    .line 120
    .line 121
    iget-object v9, v1, La/kd0;->a:La/duj;

    .line 122
    .line 123
    iget-object v0, v1, La/kd0;->c:La/ctf0;

    .line 124
    .line 125
    iget-object v7, v1, La/kd0;->e:La/ouu;

    .line 126
    .line 127
    iget-object v11, v1, La/kd0;->d:La/uyu;

    .line 128
    .line 129
    iget-object v10, v1, La/kd0;->b:La/u58;

    .line 130
    .line 131
    iget-object v12, v1, La/kd0;->h:La/s31;

    .line 132
    .line 133
    iget-object v6, v1, La/kd0;->j:La/m1e;

    .line 134
    .line 135
    iget-object v13, v1, La/kd0;->k:La/cyu;

    .line 136
    .line 137
    iget-object v14, v1, La/kd0;->l:La/wyu;

    .line 138
    .line 139
    iget-object v3, v1, La/kd0;->g:La/cad;

    .line 140
    .line 141
    iget-object v15, v1, La/kd0;->m:La/au0;

    .line 142
    .line 143
    iget-object v1, v1, La/kd0;->n:La/bzt;

    .line 144
    .line 145
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    new-instance v2, La/e7i;

    .line 155
    .line 156
    move-object/from16 v17, v1

    .line 157
    .line 158
    invoke-direct/range {v2 .. v17}, La/e7i;-><init>(La/cad;La/fvt0;La/pru;La/m1e;La/ouu;La/i1w0;La/duj;La/u58;La/uyu;La/s31;La/cyu;La/wyu;La/au0;La/g2v;La/bzt;)V

    .line 159
    .line 160
    .line 161
    move-object v3, v2

    .line 162
    goto :goto_2

    .line 163
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 164
    .line 165
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    :goto_2
    return-object v3

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
