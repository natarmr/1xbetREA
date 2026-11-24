.class public final synthetic La/w0l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/x0l0;


# direct methods
.method public synthetic constructor <init>(La/x0l0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/w0l0;->a:B

    iput-object p1, p0, La/w0l0;->b:La/x0l0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/w0l0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/w0l0;->b:La/x0l0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/q0h0;

    .line 9
    .line 10
    iget-object p0, p0, La/x0l0;->L1:La/a8z;

    .line 11
    .line 12
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/sci;

    .line 17
    .line 18
    iget-object p0, p0, La/sci;->k:La/n5d0;

    .line 19
    .line 20
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, La/rci;

    .line 25
    .line 26
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    instance-of v1, v0, La/af3;

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    check-cast v0, La/af3;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move-object v0, v2

    .line 50
    :goto_0
    const-class v1, La/z0d;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, La/o5d0;

    .line 63
    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, La/ze3;

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    move-object v0, v2

    .line 74
    :goto_1
    instance-of v3, v0, La/z0d;

    .line 75
    .line 76
    if-nez v3, :cond_2

    .line 77
    .line 78
    move-object v0, v2

    .line 79
    :cond_2
    check-cast v0, La/z0d;

    .line 80
    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    iget-object v4, v0, La/z0d;->a:La/cad;

    .line 91
    .line 92
    iget-object v5, v0, La/z0d;->b:La/ctf0;

    .line 93
    .line 94
    iget-object v7, v0, La/z0d;->c:La/duj;

    .line 95
    .line 96
    iget-object v8, v0, La/z0d;->i:La/gle0;

    .line 97
    .line 98
    iget-object v9, v0, La/z0d;->d:La/c5k;

    .line 99
    .line 100
    iget-object p0, v0, La/z0d;->e:La/btt0;

    .line 101
    .line 102
    iget-object v10, v0, La/z0d;->g:La/g2v;

    .line 103
    .line 104
    iget-object v11, v0, La/z0d;->h:La/m1e;

    .line 105
    .line 106
    iget-object v6, v0, La/z0d;->f:La/ii;

    .line 107
    .line 108
    iget-object v12, v0, La/z0d;->j:La/ouu;

    .line 109
    .line 110
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    new-instance v3, La/sci;

    .line 123
    .line 124
    invoke-direct/range {v3 .. v13}, La/sci;-><init>(La/cad;La/ctf0;La/ii;La/duj;La/gle0;La/c5k;La/g2v;La/m1e;La/ouu;La/i1w0;)V

    .line 125
    .line 126
    .line 127
    move-object v2, v3

    .line 128
    goto :goto_2

    .line 129
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 130
    .line 131
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :goto_2
    return-object v2

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
