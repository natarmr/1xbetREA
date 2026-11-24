.class public final La/gue0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic r:I


# instance fields
.field public final o:La/ytt;

.field public final p:La/duj;

.field public final q:La/bby;


# direct methods
.method public constructor <init>(Lorg/xplatform/registration_default/impl/presentation/registration_bonus/models/RegistrationBonusDefaultScreenParams;La/ctf0;La/ytt;La/mne;La/duj;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/tie0;

    .line 5
    .line 6
    const/16 v0, 0x9

    .line 7
    .line 8
    invoke-direct {v2, p1, v0}, La/tie0;-><init>(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    new-instance v3, La/iv80;

    .line 12
    .line 13
    const/16 p1, 0x11

    .line 14
    .line 15
    invoke-direct {v3, p2, p1}, La/iv80;-><init>(La/ctf0;B)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p4, La/mne;->c:La/vs10;

    .line 19
    .line 20
    iget-object p2, p4, La/mne;->a:La/rwj;

    .line 21
    .line 22
    invoke-static {p1, p2}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v1, 0x0

    .line 28
    move-object v0, p0

    .line 29
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 30
    .line 31
    .line 32
    iput-object p3, v0, La/gue0;->o:La/ytt;

    .line 33
    .line 34
    iput-object p5, v0, La/gue0;->p:La/duj;

    .line 35
    .line 36
    iget-object p0, v0, La/gue0;->q:La/bby;

    .line 37
    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    invoke-interface {p0}, La/bby;->isActive()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    const/4 p1, 0x1

    .line 45
    if-ne p0, p1, :cond_0

    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-object v4, p4, La/mne;->b:La/dvj;

    .line 53
    .line 54
    new-instance v2, La/eme0;

    .line 55
    .line 56
    const/4 p0, 0x5

    .line 57
    invoke-direct {v2, v0, p0}, La/eme0;-><init>(Ljava/lang/Object;B)V

    .line 58
    .line 59
    .line 60
    new-instance v5, La/coc0;

    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    const/16 p1, 0x10

    .line 64
    .line 65
    invoke-direct {v5, v0, p0, p1}, La/coc0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 66
    .line 67
    .line 68
    const/16 v6, 0xa

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    iput-object p0, v0, La/gue0;->q:La/bby;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, La/kg8;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, La/jg8;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, La/lg8;

    .line 11
    .line 12
    check-cast p1, La/jg8;

    .line 13
    .line 14
    iget v1, p1, La/jg8;->a:I

    .line 15
    .line 16
    iget-object p1, p1, La/jg8;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-direct {v0, v1, p1}, La/lg8;-><init>(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    sget-object v0, La/ig8;->a:La/ig8;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 38
    .line 39
    .line 40
    return-void
.end method
