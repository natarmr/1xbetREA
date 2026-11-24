.class public final La/v6l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:La/w6l;

.field public final synthetic b:J

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(La/w6l;JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/v6l;->a:La/w6l;

    .line 5
    .line 6
    iput-wide p2, p0, La/v6l;->b:J

    .line 7
    .line 8
    iput-boolean p4, p0, La/v6l;->c:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, La/v6l;->a:La/w6l;

    .line 8
    .line 9
    invoke-static {p1}, La/s7n0;->l(Landroid/view/View;)La/clz;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    invoke-interface {p2}, La/clz;->x()La/glz;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-static {p2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iget-object p3, p1, La/w6l;->c:La/c4m0;

    .line 24
    .line 25
    const/4 p4, 0x0

    .line 26
    if-eqz p3, :cond_0

    .line 27
    .line 28
    invoke-virtual {p3, p4}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    sget-object p3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 32
    .line 33
    iget-wide p5, p0, La/v6l;->b:J

    .line 34
    .line 35
    invoke-virtual {p3, p5, p6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 36
    .line 37
    .line 38
    move-result-wide p5

    .line 39
    const-wide/16 p7, 0x0

    .line 40
    .line 41
    const/4 p3, 0x4

    .line 42
    invoke-static {p3, p5, p6, p7, p8}, La/sac;->L(IJJ)La/vsg0;

    .line 43
    .line 44
    .line 45
    move-result-object p5

    .line 46
    new-instance p6, La/bk5;

    .line 47
    .line 48
    iget-boolean p0, p0, La/v6l;->c:Z

    .line 49
    .line 50
    invoke-direct {p6, p1, p0, p4}, La/bk5;-><init>(La/w6l;ZLa/yje;)V

    .line 51
    .line 52
    .line 53
    new-instance p0, La/fnq;

    .line 54
    .line 55
    invoke-direct {p0, p5, p6, p3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 56
    .line 57
    .line 58
    new-instance p3, La/ko0;

    .line 59
    .line 60
    const/16 p5, 0xd

    .line 61
    .line 62
    invoke-direct {p3, p1, p4, p5}, La/ko0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 63
    .line 64
    .line 65
    new-instance p5, La/dnq;

    .line 66
    .line 67
    const/4 p6, 0x0

    .line 68
    invoke-direct {p5, p0, p3, p6}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 69
    .line 70
    .line 71
    sget-object p0, La/tvk;->a:La/rwj;

    .line 72
    .line 73
    invoke-static {p2, p0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    new-instance p2, La/f1e;

    .line 78
    .line 79
    const/4 p3, 0x2

    .line 80
    const/16 p6, 0x11

    .line 81
    .line 82
    invoke-direct {p2, p3, p4, p6}, La/f1e;-><init>(ILa/yje;B)V

    .line 83
    .line 84
    .line 85
    invoke-static {p5, p0, p2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    iput-object p0, p1, La/w6l;->c:La/c4m0;

    .line 90
    .line 91
    :cond_1
    return-void
.end method
