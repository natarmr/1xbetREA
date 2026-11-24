.class public abstract La/brv0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/uxs0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/uxs0;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/uxs0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/brv0;->a:La/uxs0;

    .line 9
    .line 10
    return-void
.end method

.method public static a(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p0, La/arv0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast p0, La/arv0;

    .line 7
    .line 8
    iget-object p0, p0, La/arv0;->a:Ljava/lang/Throwable;

    .line 9
    .line 10
    throw p0
.end method
