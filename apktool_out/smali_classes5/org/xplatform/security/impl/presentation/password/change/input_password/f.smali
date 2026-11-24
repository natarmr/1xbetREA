.class public final Lorg/xplatform/security/impl/presentation/password/change/input_password/f;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/vzg0;

.field public final c:La/i1w0;

.field public final d:La/we50;

.field public final e:La/mxg0;

.field public final f:La/zn00;

.field public final g:La/ort;

.field public final h:La/cyh;

.field public final i:La/e0c;

.field public final j:La/z4w0;

.field public final k:La/mne;

.field public final l:La/duj;

.field public final m:La/p7m0;

.field public final n:La/xae0;

.field public final o:La/p7m0;

.field public final p:La/ol60;

.field public q:La/c4m0;

.field public final r:La/c4m0;

.field public s:Z


# direct methods
.method public constructor <init>(La/vzg0;La/i1w0;La/we50;La/mxg0;La/zn00;La/ort;La/cyh;La/e0c;La/z4w0;La/mne;La/duj;La/m1e;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, La/w46;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->b:La/vzg0;

    .line 11
    .line 12
    iput-object p2, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->c:La/i1w0;

    .line 13
    .line 14
    iput-object p3, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->d:La/we50;

    .line 15
    .line 16
    iput-object p4, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->e:La/mxg0;

    .line 17
    .line 18
    iput-object p5, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->f:La/zn00;

    .line 19
    .line 20
    iput-object p6, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->g:La/ort;

    .line 21
    .line 22
    iput-object p7, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->h:La/cyh;

    .line 23
    .line 24
    iput-object p8, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->i:La/e0c;

    .line 25
    .line 26
    iput-object p9, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->j:La/z4w0;

    .line 27
    .line 28
    iput-object p10, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->k:La/mne;

    .line 29
    .line 30
    iput-object p11, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->l:La/duj;

    .line 31
    .line 32
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    iput-object p3, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->m:La/p7m0;

    .line 39
    .line 40
    const-string p3, "current_password_key"

    .line 41
    .line 42
    sget-object p4, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState$Default;->b:Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState$Default;

    .line 43
    .line 44
    invoke-virtual {p1, p4, p3}, La/vzg0;->c(Ljava/lang/Object;Ljava/lang/String;)La/xae0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->n:La/xae0;

    .line 49
    .line 50
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->o:La/p7m0;

    .line 55
    .line 56
    new-instance p1, La/ol60;

    .line 57
    .line 58
    const/4 p2, 0x3

    .line 59
    invoke-direct {p1, p2}, La/ol60;-><init>(I)V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->p:La/ol60;

    .line 63
    .line 64
    iget-object p1, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->r:La/c4m0;

    .line 65
    .line 66
    if-eqz p1, :cond_0

    .line 67
    .line 68
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    const/4 p2, 0x1

    .line 73
    if-ne p1, p2, :cond_0

    .line 74
    .line 75
    return-void

    .line 76
    :cond_0
    invoke-interface {p12}, La/m1e;->b()La/gmq;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    new-instance p2, La/c670;

    .line 81
    .line 82
    const/16 p3, 0x9

    .line 83
    .line 84
    const/4 p4, 0x0

    .line 85
    invoke-direct {p2, p0, p4, p3}, La/c670;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 86
    .line 87
    .line 88
    new-instance p3, La/fnq;

    .line 89
    .line 90
    const/4 p5, 0x4

    .line 91
    invoke-direct {p3, p1, p2, p5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 92
    .line 93
    .line 94
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iget-object p2, p10, La/mne;->a:La/rwj;

    .line 99
    .line 100
    invoke-static {p1, p2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    new-instance p2, La/st20;

    .line 105
    .line 106
    const/4 p5, 0x2

    .line 107
    const/16 p6, 0xc

    .line 108
    .line 109
    invoke-direct {p2, p5, p4, p6}, La/st20;-><init>(ILa/yje;B)V

    .line 110
    .line 111
    .line 112
    invoke-static {p3, p1, p2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iput-object p1, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->r:La/c4m0;

    .line 117
    .line 118
    return-void
.end method
