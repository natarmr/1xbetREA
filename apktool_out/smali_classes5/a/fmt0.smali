.class public final La/fmt0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/aag0;


# direct methods
.method public constructor <init>(La/aag0;)V
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
    iput-object p1, p0, La/fmt0;->a:La/aag0;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, La/fmt0;->a:La/aag0;

    .line 2
    .line 3
    iget-object p0, p0, La/aag0;->a:La/z9g0;

    .line 4
    .line 5
    iget-object p0, p0, La/z9g0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0, v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method
