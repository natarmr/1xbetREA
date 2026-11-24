.class public abstract La/ak30;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/adservices/measurement/MeasurementManager;


# direct methods
.method public constructor <init>(Landroid/adservices/measurement/MeasurementManager;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ak30;->a:Landroid/adservices/measurement/MeasurementManager;

    .line 8
    .line 9
    return-void
.end method

.method public static b(La/ak30;La/yje;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/ak30;",
            "La/yje<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, La/n5a;

    .line 2
    .line 3
    invoke-static {p1}, La/pnx;->b(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p1}, La/n5a;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, La/n5a;->r()V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/ak30;->a:Landroid/adservices/measurement/MeasurementManager;

    .line 15
    .line 16
    new-instance p1, La/ew3;

    .line 17
    .line 18
    invoke-direct {p1, v1}, La/ew3;-><init>(B)V

    .line 19
    .line 20
    .line 21
    new-instance v1, La/bke;

    .line 22
    .line 23
    invoke-direct {v1, v0}, La/bke;-><init>(La/n5a;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, p1, v1}, La/mmv;->u(Landroid/adservices/measurement/MeasurementManager;La/ew3;Landroid/os/OutcomeReceiver;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, La/n5a;->p()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    sget-object p1, La/wne;->a:La/wne;

    .line 34
    .line 35
    return-object p0
.end method

.method public static d(La/ak30;Landroid/net/Uri;La/yje;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/ak30;",
            "Landroid/net/Uri;",
            "La/yje<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, La/n5a;

    .line 2
    .line 3
    invoke-static {p2}, La/pnx;->b(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p2}, La/n5a;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, La/n5a;->r()V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/ak30;->a:Landroid/adservices/measurement/MeasurementManager;

    .line 15
    .line 16
    new-instance p2, La/ew3;

    .line 17
    .line 18
    invoke-direct {p2, v1}, La/ew3;-><init>(B)V

    .line 19
    .line 20
    .line 21
    new-instance v1, La/bke;

    .line 22
    .line 23
    invoke-direct {v1, v0}, La/bke;-><init>(La/n5a;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, p1, p2, v1}, La/mmv;->v(Landroid/adservices/measurement/MeasurementManager;Landroid/net/Uri;La/ew3;Landroid/os/OutcomeReceiver;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, La/n5a;->p()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    sget-object p1, La/wne;->a:La/wne;

    .line 34
    .line 35
    if-ne p0, p1, :cond_0

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0
.end method


# virtual methods
.method public a(La/yje;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/yje<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, La/ak30;->b(La/ak30;La/yje;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public c(Landroid/net/Uri;La/yje;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "La/yje<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, La/ak30;->d(La/ak30;Landroid/net/Uri;La/yje;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
