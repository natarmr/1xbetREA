.class public final La/vmi;
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
    iput-object p1, p0, La/vmi;->a:La/gji;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 6

    .line 1
    new-instance v0, La/vc70;

    .line 2
    .line 3
    iget-object p0, p0, La/vmi;->a:La/gji;

    .line 4
    .line 5
    iget-object p0, p0, La/gji;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/ali;

    .line 8
    .line 9
    iget-object v1, p0, La/ali;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, La/cad;

    .line 12
    .line 13
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, La/psc;

    .line 16
    .line 17
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, La/ali;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, La/ctf0;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v2, La/fq60;

    .line 32
    .line 33
    const/16 v3, 0x17

    .line 34
    .line 35
    invoke-direct {v2, v3}, La/fq60;-><init>(B)V

    .line 36
    .line 37
    .line 38
    new-instance v3, La/v510;

    .line 39
    .line 40
    const/16 v4, 0x1a

    .line 41
    .line 42
    invoke-direct {v3, p0, v4}, La/v510;-><init>(La/ctf0;B)V

    .line 43
    .line 44
    .line 45
    iget-object p0, v1, La/mne;->c:La/vs10;

    .line 46
    .line 47
    iget-object v1, v1, La/mne;->a:La/rwj;

    .line 48
    .line 49
    invoke-static {p0, v1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

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
    const-string p0, "OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_BUNDLE_DEMO_AVAILABLE"

    .line 59
    .line 60
    invoke-virtual {p1, p0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, Ljava/lang/Boolean;

    .line 65
    .line 66
    if-eqz p0, :cond_0

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    const/4 p0, 0x0

    .line 74
    :goto_0
    iget-object p1, v0, La/i3t0;->i:La/ocj;

    .line 75
    .line 76
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 77
    .line 78
    :cond_1
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-object v2, v1

    .line 86
    check-cast v2, La/qc70;

    .line 87
    .line 88
    iget-object v2, v0, La/i3t0;->f:La/oyg0;

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    new-instance v2, La/qc70;

    .line 94
    .line 95
    invoke-direct {v2, p0}, La/qc70;-><init>(Z)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_1

    .line 103
    .line 104
    return-object v0
.end method
