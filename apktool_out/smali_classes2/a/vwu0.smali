.class public final La/vwu0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic p:I


# instance fields
.field public final o:La/duj;


# direct methods
.method public constructor <init>(La/duj;La/mne;La/ctf0;)V
    .locals 3

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/o1u0;

    .line 5
    .line 6
    const/16 v1, 0x19

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/o1u0;-><init>(B)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p2, La/mne;->c:La/vs10;

    .line 12
    .line 13
    iget-object p2, p2, La/mne;->a:La/rwj;

    .line 14
    .line 15
    invoke-static {v1, p2}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    new-instance v1, La/uwu0;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v1, p3, v2}, La/uwu0;-><init>(La/ctf0;B)V

    .line 23
    .line 24
    .line 25
    const/4 p3, 0x0

    .line 26
    invoke-direct {p0, v0, p2, v1, p3}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, La/vwu0;->o:La/duj;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 11

    .line 1
    check-cast p1, La/mwu0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, La/kwu0;->a:La/kwu0;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance v3, La/las0;

    .line 20
    .line 21
    const/4 v9, 0x0

    .line 22
    const/16 v10, 0x1a

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    iget-object v5, p0, La/vwu0;->o:La/duj;

    .line 26
    .line 27
    const-class v6, La/duj;

    .line 28
    .line 29
    const-string v7, "handleError"

    .line 30
    .line 31
    const-string v8, "handleError(Ljava/lang/Throwable;)V"

    .line 32
    .line 33
    invoke-direct/range {v3 .. v10}, La/las0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 34
    .line 35
    .line 36
    new-instance p1, La/jtr0;

    .line 37
    .line 38
    invoke-direct {p1, p0, v2, v1}, La/jtr0;-><init>(La/vwu0;ZLa/yje;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p0, v1, v3, p1, v2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    sget-object v0, La/lwu0;->a:La/lwu0;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    new-instance v3, La/las0;

    .line 54
    .line 55
    const/4 v9, 0x0

    .line 56
    const/16 v10, 0x1a

    .line 57
    .line 58
    const/4 v4, 0x1

    .line 59
    iget-object v5, p0, La/vwu0;->o:La/duj;

    .line 60
    .line 61
    const-class v6, La/duj;

    .line 62
    .line 63
    const-string v7, "handleError"

    .line 64
    .line 65
    const-string v8, "handleError(Ljava/lang/Throwable;)V"

    .line 66
    .line 67
    invoke-direct/range {v3 .. v10}, La/las0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 68
    .line 69
    .line 70
    new-instance p1, La/jtr0;

    .line 71
    .line 72
    const/4 v0, 0x0

    .line 73
    invoke-direct {p1, p0, v0, v1}, La/jtr0;-><init>(La/vwu0;ZLa/yje;)V

    .line 74
    .line 75
    .line 76
    invoke-static {p0, v1, v3, p1, v2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_1
    sget-object v0, La/jwu0;->a:La/jwu0;

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_2

    .line 87
    .line 88
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 93
    .line 94
    .line 95
    return-void
.end method
