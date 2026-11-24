.class public final synthetic La/y1v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a2v0;


# direct methods
.method public synthetic constructor <init>(La/a2v0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/y1v0;->a:B

    iput-object p1, p0, La/y1v0;->b:La/a2v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/y1v0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/y1v0;->b:La/a2v0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/a2v0;->c2:La/a8z;

    .line 9
    .line 10
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/izi;

    .line 15
    .line 16
    new-instance v0, La/fiu0;

    .line 17
    .line 18
    const-class v1, La/h2v0;

    .line 19
    .line 20
    iget-object p0, p0, La/izi;->f:La/yxi;

    .line 21
    .line 22
    invoke-static {v1, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {v0, p0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    sget-object v0, La/a2v0;->g2:La/svs0;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    instance-of v1, v0, La/af3;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    check-cast v0, La/af3;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object v0, v2

    .line 52
    :goto_0
    const-class v1, La/b2v0;

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, La/o5d0;

    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, La/ze3;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    move-object v0, v2

    .line 76
    :goto_1
    instance-of v3, v0, La/b2v0;

    .line 77
    .line 78
    if-nez v3, :cond_2

    .line 79
    .line 80
    move-object v0, v2

    .line 81
    :cond_2
    check-cast v0, La/b2v0;

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    invoke-virtual {p0}, La/a2v0;->S0()La/c2v0;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    iget-object v5, v0, La/b2v0;->a:La/ntu;

    .line 90
    .line 91
    iget-object p0, v0, La/b2v0;->b:La/vby;

    .line 92
    .line 93
    iget-object v7, v0, La/b2v0;->c:La/g2v;

    .line 94
    .line 95
    iget-object v6, v0, La/b2v0;->d:La/pyu;

    .line 96
    .line 97
    iget-object v1, v0, La/b2v0;->e:La/l6a;

    .line 98
    .line 99
    iget-object v4, v0, La/b2v0;->f:La/mne;

    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    new-instance v3, La/izi;

    .line 108
    .line 109
    invoke-direct/range {v3 .. v8}, La/izi;-><init>(La/mne;La/ntu;La/pyu;La/g2v;La/c2v0;)V

    .line 110
    .line 111
    .line 112
    move-object v2, v3

    .line 113
    goto :goto_2

    .line 114
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 115
    .line 116
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :goto_2
    return-object v2

    .line 124
    :pswitch_1
    sget-object v0, La/a2v0;->g2:La/svs0;

    .line 125
    .line 126
    invoke-virtual {p0}, La/a2v0;->S0()La/c2v0;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iget-object v0, v0, La/c2v0;->a:Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v1, p0, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    const/4 v0, 0x0

    .line 140
    invoke-virtual {p0, v0, v0, v0}, La/sik;->z0(ZZZ)V

    .line 141
    .line 142
    .line 143
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    return-object p0

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
