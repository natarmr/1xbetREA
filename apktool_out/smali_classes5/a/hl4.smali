.class public final La/hl4;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/kt2;

.field public final c:La/i1w0;

.field public final d:La/duj;

.field public final e:La/mne;

.field public final f:La/ix0;

.field public final g:La/p7m0;

.field public final h:La/p7m0;


# direct methods
.method public constructor <init>(La/wyu;La/uyu;La/kt2;La/i1w0;La/duj;La/mne;La/ix0;La/pru;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, La/w46;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p3, p0, La/hl4;->b:La/kt2;

    .line 11
    .line 12
    iput-object p4, p0, La/hl4;->c:La/i1w0;

    .line 13
    .line 14
    iput-object p5, p0, La/hl4;->d:La/duj;

    .line 15
    .line 16
    iput-object p6, p0, La/hl4;->e:La/mne;

    .line 17
    .line 18
    iput-object p7, p0, La/hl4;->f:La/ix0;

    .line 19
    .line 20
    new-instance p3, La/dl4;

    .line 21
    .line 22
    sget-object p4, La/uaq0;->a:La/s9m0;

    .line 23
    .line 24
    invoke-static {p1, p4}, La/h97;->A(La/wyu;La/s9m0;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    const-string p1, "/static/img/android/instructions/onboarding_registration/en/1_d.png"

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-string p1, "/static/img/android/instructions/onboarding_registration/en/1_l.png"

    .line 34
    .line 35
    :goto_0
    invoke-direct {p3, p1}, La/dl4;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p3}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, La/hl4;->g:La/p7m0;

    .line 43
    .line 44
    invoke-virtual {p8}, La/pru;->a()La/sff0;

    .line 45
    .line 46
    .line 47
    sget-object p1, La/uk4;->a:La/uk4;

    .line 48
    .line 49
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, La/hl4;->h:La/p7m0;

    .line 54
    .line 55
    iget-object p1, p2, La/uyu;->a:La/v6j0;

    .line 56
    .line 57
    invoke-virtual {p1}, La/v6j0;->h()La/qz40;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance p2, La/cm3;

    .line 62
    .line 63
    const/16 p3, 0xb

    .line 64
    .line 65
    const/4 p4, 0x0

    .line 66
    invoke-direct {p2, p0, p4, p3}, La/cm3;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 67
    .line 68
    .line 69
    new-instance p3, La/fnq;

    .line 70
    .line 71
    const/4 p5, 0x4

    .line 72
    invoke-direct {p3, p1, p2, p5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    iget-object p1, p6, La/mne;->b:La/dvj;

    .line 80
    .line 81
    invoke-static {p0, p1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    new-instance p1, La/pd;

    .line 86
    .line 87
    const/4 p2, 0x2

    .line 88
    const/16 p5, 0x12

    .line 89
    .line 90
    invoke-direct {p1, p2, p4, p5}, La/pd;-><init>(ILa/yje;B)V

    .line 91
    .line 92
    .line 93
    invoke-static {p3, p0, p1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 94
    .line 95
    .line 96
    return-void
.end method
