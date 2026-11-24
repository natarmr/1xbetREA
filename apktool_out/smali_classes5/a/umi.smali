.class public final La/umi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/gji;


# direct methods
.method public constructor <init>(La/gji;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/umi;->a:La/gji;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 6

    .line 1
    new-instance v0, La/v970;

    .line 2
    .line 3
    iget-object p0, p0, La/umi;->a:La/gji;

    .line 4
    .line 5
    iget-object p0, p0, La/gji;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/ali;

    .line 8
    .line 9
    iget-object v1, p0, La/ali;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, La/ctf0;

    .line 12
    .line 13
    iget-object p0, p0, La/ali;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/cad;

    .line 16
    .line 17
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, La/psc;

    .line 20
    .line 21
    invoke-virtual {p0}, La/psc;->h()La/mne;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v2, La/fq60;

    .line 32
    .line 33
    const/16 v3, 0x16

    .line 34
    .line 35
    invoke-direct {v2, v3}, La/fq60;-><init>(B)V

    .line 36
    .line 37
    .line 38
    new-instance v3, La/v510;

    .line 39
    .line 40
    const/16 v4, 0x19

    .line 41
    .line 42
    invoke-direct {v3, v1, v4}, La/v510;-><init>(La/ctf0;B)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, La/mne;->a:La/rwj;

    .line 46
    .line 47
    iget-object p0, p0, La/mne;->b:La/dvj;

    .line 48
    .line 49
    invoke-static {v1, p0}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    const/4 v5, 0x0

    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 56
    .line 57
    .line 58
    const-string p0, "OneXGamesWebGame.DISABLE_DEMO_DIALOG_BUNDLE_BALANCE"

    .line 59
    .line 60
    invoke-virtual {p1, p0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, Ljava/lang/String;

    .line 65
    .line 66
    const-string v1, ""

    .line 67
    .line 68
    if-nez p0, :cond_0

    .line 69
    .line 70
    move-object p0, v1

    .line 71
    :cond_0
    const-string v2, "OneXGamesWebGame.DISABLE_DEMO_DIALOG_BUNDLE_TOTAL_SUM"

    .line 72
    .line 73
    invoke-virtual {p1, v2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Ljava/lang/String;

    .line 78
    .line 79
    if-nez v2, :cond_1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    move-object v1, v2

    .line 83
    :goto_0
    const-string v2, "OneXGamesWebGame.DISABLE_DEMO_DIALOG_BUNDLE_EXIT_ENABLE"

    .line 84
    .line 85
    invoke-virtual {p1, v2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Ljava/lang/Boolean;

    .line 90
    .line 91
    if-eqz p1, :cond_2

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    goto :goto_1

    .line 98
    :cond_2
    const/4 p1, 0x0

    .line 99
    :goto_1
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 100
    .line 101
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 102
    .line 103
    :cond_3
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-object v4, v3

    .line 111
    check-cast v4, La/q970;

    .line 112
    .line 113
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 114
    .line 115
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    new-instance v4, La/q970;

    .line 119
    .line 120
    invoke-direct {v4, p0, v1, p1}, La/q970;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-eqz v3, :cond_3

    .line 128
    .line 129
    return-object v0
.end method
