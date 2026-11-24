.class public final synthetic La/bst0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/daf;


# direct methods
.method public synthetic constructor <init>(La/daf;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bst0;->a:B

    iput-object p1, p0, La/bst0;->b:La/daf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/bst0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/bst0;->b:La/daf;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/k0w0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/daf;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/zx10;

    .line 17
    .line 18
    sget-object v0, La/r040;->k:La/r040;

    .line 19
    .line 20
    new-instance v2, Lorg/xplatform/main_menu/impl/navigation/MainMenuFragmentScreen;

    .line 21
    .line 22
    iget-object p0, p0, La/zx10;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, La/r9u;

    .line 25
    .line 26
    sget-object v3, La/ygp;->f:La/ygp;

    .line 27
    .line 28
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 34
    .line 35
    invoke-virtual {p0, v3}, La/m1q0;->d(La/ygp;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-direct {v2, v0, v1, v3, p0}, Lorg/xplatform/main_menu/impl/navigation/MainMenuFragmentScreen;-><init>(La/r040;ZZZ)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, La/c8d;

    .line 50
    .line 51
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 52
    .line 53
    new-instance v0, La/v7d;

    .line 54
    .line 55
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, La/daf;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p0, La/pmi0;

    .line 71
    .line 72
    sget-object v0, La/d6j0;->c:La/d6j0;

    .line 73
    .line 74
    new-instance v2, Lorg/xplatform/settings/impl/navigation/SettingsScreenFactoryImpl$getScreen$1;

    .line 75
    .line 76
    invoke-direct {v2, p0, v0}, Lorg/xplatform/settings/impl/navigation/SettingsScreenFactoryImpl$getScreen$1;-><init>(La/pmi0;La/d6j0;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p0, La/c8d;

    .line 86
    .line 87
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 88
    .line 89
    new-instance v0, La/v7d;

    .line 90
    .line 91
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 92
    .line 93
    .line 94
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 95
    .line 96
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_1
    check-cast p1, La/i1w0;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    new-instance v0, La/bst0;

    .line 105
    .line 106
    const/4 v1, 0x3

    .line 107
    invoke-direct {v0, p0, v1}, La/bst0;-><init>(La/daf;B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 111
    .line 112
    .line 113
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object p0

    .line 116
    :pswitch_2
    check-cast p1, La/i1w0;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    new-instance v0, La/bst0;

    .line 122
    .line 123
    const/4 v1, 0x2

    .line 124
    invoke-direct {v0, p0, v1}, La/bst0;-><init>(La/daf;B)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 128
    .line 129
    .line 130
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
