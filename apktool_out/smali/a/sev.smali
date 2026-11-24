.class public final La/sev;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/r2a;

.field public b:La/b0a;


# direct methods
.method public constructor <init>(La/r2a;)V
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
    iput-object p1, p0, La/sev;->a:La/r2a;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()La/b0a;
    .locals 0

    .line 1
    iget-object p0, p0, La/sev;->b:La/b0a;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "cameraGraph"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method
