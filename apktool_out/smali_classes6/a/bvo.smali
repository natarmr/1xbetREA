.class public final La/bvo;
.super La/uke;
.source "SourceFile"


# instance fields
.field public final a:Lokhttp3/MediaType;

.field public final b:La/lhi0;


# direct methods
.method public constructor <init>(Lokhttp3/MediaType;La/lhi0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/bvo;->a:Lokhttp3/MediaType;

    .line 5
    .line 6
    iput-object p2, p0, La/bvo;->b:La/lhi0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;La/y9g0;)La/vke;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p2, p0, La/bvo;->b:La/lhi0;

    .line 8
    .line 9
    iget-object p3, p2, La/lhi0;->a:La/vby;

    .line 10
    .line 11
    iget-object p3, p3, La/vby;->b:La/qaj;

    .line 12
    .line 13
    invoke-static {p3, p1}, La/q5x;->Q(La/qaj;Ljava/lang/reflect/Type;)La/jiy;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance p3, La/gxu;

    .line 18
    .line 19
    iget-object p0, p0, La/bvo;->a:Lokhttp3/MediaType;

    .line 20
    .line 21
    check-cast p1, La/jiy;

    .line 22
    .line 23
    invoke-direct {p3, p0, p1, p2}, La/gxu;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object p3
.end method

.method public final b(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;La/y9g0;)La/vke;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/bvo;->b:La/lhi0;

    .line 5
    .line 6
    iget-object p2, p0, La/lhi0;->a:La/vby;

    .line 7
    .line 8
    iget-object p2, p2, La/vby;->b:La/qaj;

    .line 9
    .line 10
    invoke-static {p2, p1}, La/q5x;->Q(La/qaj;Ljava/lang/reflect/Type;)La/jiy;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance p2, La/jtj;

    .line 15
    .line 16
    check-cast p1, La/jiy;

    .line 17
    .line 18
    const/4 p3, 0x2

    .line 19
    invoke-direct {p2, p1, p0, p3}, La/jtj;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    return-object p2
.end method
