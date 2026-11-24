.class public final La/uew0;
.super Ljava/util/AbstractList;
.source "SourceFile"


# instance fields
.field public final a:La/sew0;

.field public final b:La/tew0;


# direct methods
.method public constructor <init>(La/sew0;La/tew0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/uew0;->a:La/sew0;

    .line 5
    .line 6
    iput-object p2, p0, La/uew0;->b:La/tew0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, La/uew0;->a:La/sew0;

    .line 2
    .line 3
    check-cast v0, La/oew0;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, La/oew0;->e(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object p0, p0, La/uew0;->b:La/tew0;

    .line 10
    .line 11
    check-cast p0, La/cpw0;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, La/fdw0;->a(I)La/fdw0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    sget-object p0, La/fdw0;->b:La/fdw0;

    .line 23
    .line 24
    :cond_0
    return-object p0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, La/uew0;->a:La/sew0;

    .line 2
    .line 3
    check-cast p0, La/oew0;

    .line 4
    .line 5
    iget p0, p0, La/oew0;->c:I

    .line 6
    .line 7
    return p0
.end method
