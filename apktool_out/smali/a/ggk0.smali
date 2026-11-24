.class public final La/ggk0;
.super La/e8m0;
.source "SourceFile"


# instance fields
.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, La/e8m0;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ggk0;->c:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/e8m0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, La/ggk0;

    .line 5
    .line 6
    iget-object p1, p1, La/ggk0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p1, p0, La/ggk0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public final b(J)La/e8m0;
    .locals 1

    .line 1
    new-instance v0, La/ggk0;

    .line 2
    .line 3
    iget-object p0, p0, La/ggk0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, La/ggk0;-><init>(Ljava/lang/Object;J)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
