.class public final synthetic La/bt90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/et90;


# direct methods
.method public synthetic constructor <init>(La/et90;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bt90;->a:B

    iput-object p1, p0, La/bt90;->b:La/et90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/bt90;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/bt90;->b:La/et90;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/et90;->j2:La/mi70;

    .line 9
    .line 10
    iget-object v0, p0, La/et90;->h2:La/phf0;

    .line 11
    .line 12
    sget-object v1, La/et90;->k2:[La/iiy;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    aget-object v1, v1, v2

    .line 16
    .line 17
    invoke-virtual {v0, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1, p0, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    sget-object v0, La/et90;->j2:La/mi70;

    .line 35
    .line 36
    iget-object p0, p0, La/et90;->e2:La/n0o0;

    .line 37
    .line 38
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, La/vni;

    .line 43
    .line 44
    new-instance v0, La/fiu0;

    .line 45
    .line 46
    const-class v1, La/kt90;

    .line 47
    .line 48
    iget-object p0, p0, La/vni;->d:La/eni;

    .line 49
    .line 50
    invoke-static {v1, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-direct {v0, p0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_1
    sget-object v0, La/et90;->j2:La/mi70;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    instance-of v0, p0, La/af3;

    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    if-eqz v0, :cond_0

    .line 75
    .line 76
    check-cast p0, La/af3;

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    move-object p0, v1

    .line 80
    :goto_0
    const-class v0, La/zs90;

    .line 81
    .line 82
    if-eqz p0, :cond_3

    .line 83
    .line 84
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {p0, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, La/o5d0;

    .line 93
    .line 94
    if-eqz p0, :cond_1

    .line 95
    .line 96
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    check-cast p0, La/ze3;

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    move-object p0, v1

    .line 104
    :goto_1
    instance-of v2, p0, La/zs90;

    .line 105
    .line 106
    if-nez v2, :cond_2

    .line 107
    .line 108
    move-object p0, v1

    .line 109
    :cond_2
    check-cast p0, La/zs90;

    .line 110
    .line 111
    if-eqz p0, :cond_3

    .line 112
    .line 113
    iget-object v0, p0, La/zs90;->a:La/nr00;

    .line 114
    .line 115
    iget-object v1, p0, La/zs90;->b:La/ii;

    .line 116
    .line 117
    iget-object p0, p0, La/zs90;->c:La/ctf0;

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    new-instance v2, La/vni;

    .line 126
    .line 127
    invoke-direct {v2, v0, v1, p0}, La/vni;-><init>(La/nr00;La/ii;La/ctf0;)V

    .line 128
    .line 129
    .line 130
    move-object v1, v2

    .line 131
    goto :goto_2

    .line 132
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 133
    .line 134
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    :goto_2
    return-object v1

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
