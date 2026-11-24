.class public final synthetic La/l1x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/lin0;


# static fields
.field public static final synthetic a:La/l1x0;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/l1x0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/l1x0;->a:La/l1x0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object p0, La/c1x0;->j:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object p0, La/ixv;->b:La/ixv;

    .line 4
    .line 5
    invoke-static {p0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of v0, p0, La/fr40;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p0, La/fr40;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance v0, La/fr40;

    .line 17
    .line 18
    invoke-direct {v0, p0}, La/fr40;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method
