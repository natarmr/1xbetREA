.class public final synthetic La/cru0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/eru0;


# direct methods
.method public synthetic constructor <init>(La/eru0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/cru0;->a:B

    iput-object p1, p0, La/cru0;->b:La/eru0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/cru0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/cru0;->b:La/eru0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/eru0;->Q1:La/wxs0;

    .line 10
    .line 11
    iget-object p0, p0, La/eru0;->N1:La/a8z;

    .line 12
    .line 13
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/k3t0;

    .line 18
    .line 19
    sget-object v0, La/squ0;->a:La/squ0;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    sget-object v0, La/eru0;->Q1:La/wxs0;

    .line 28
    .line 29
    iget-object p0, p0, La/eru0;->K1:La/fiu0;

    .line 30
    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_0
    const-string p0, "viewModelFactory"

    .line 35
    .line 36
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v1

    .line 40
    :pswitch_1
    sget-object v0, La/eru0;->Q1:La/wxs0;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    instance-of v0, p0, La/af3;

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    check-cast p0, La/af3;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move-object p0, v1

    .line 61
    :goto_0
    const-class v0, La/lnu0;

    .line 62
    .line 63
    if-eqz p0, :cond_4

    .line 64
    .line 65
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, La/o5d0;

    .line 74
    .line 75
    if-eqz p0, :cond_2

    .line 76
    .line 77
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    check-cast p0, La/ze3;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    move-object p0, v1

    .line 85
    :goto_1
    instance-of v2, p0, La/lnu0;

    .line 86
    .line 87
    if-nez v2, :cond_3

    .line 88
    .line 89
    move-object p0, v1

    .line 90
    :cond_3
    check-cast p0, La/lnu0;

    .line 91
    .line 92
    if-eqz p0, :cond_4

    .line 93
    .line 94
    iget-object v5, p0, La/lnu0;->a:La/g2v;

    .line 95
    .line 96
    iget-object v3, p0, La/lnu0;->b:La/cad;

    .line 97
    .line 98
    iget-object v6, p0, La/lnu0;->c:La/m1e;

    .line 99
    .line 100
    iget-object v7, p0, La/lnu0;->d:La/gii0;

    .line 101
    .line 102
    iget-object v8, p0, La/lnu0;->e:La/oeg0;

    .line 103
    .line 104
    iget-object v4, p0, La/lnu0;->f:La/pyg;

    .line 105
    .line 106
    iget-object v9, p0, La/lnu0;->g:La/ctf0;

    .line 107
    .line 108
    iget-object v10, p0, La/lnu0;->h:La/pmi;

    .line 109
    .line 110
    iget-object v11, p0, La/lnu0;->i:La/knf0;

    .line 111
    .line 112
    iget-object v0, p0, La/lnu0;->j:La/iip;

    .line 113
    .line 114
    iget-object v12, p0, La/lnu0;->k:La/vqc;

    .line 115
    .line 116
    iget-object p0, p0, La/lnu0;->l:La/sjl0;

    .line 117
    .line 118
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    new-instance v2, La/bzi;

    .line 143
    .line 144
    invoke-direct/range {v2 .. v12}, La/bzi;-><init>(La/cad;La/pyg;La/g2v;La/m1e;La/gii0;La/oeg0;La/ctf0;La/pmi;La/knf0;La/vqc;)V

    .line 145
    .line 146
    .line 147
    move-object v1, v2

    .line 148
    goto :goto_2

    .line 149
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 150
    .line 151
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    :goto_2
    return-object v1

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
