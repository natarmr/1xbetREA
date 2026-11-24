.class public final La/t1t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# static fields
.field public static final a:La/t1t0;

.field public static final b:La/scx;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/t1t0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/t1t0;->a:La/t1t0;

    .line 7
    .line 8
    sget-object v0, La/yf9;->a:La/yf9;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v0, La/ag9;->a:La/ag9;

    .line 14
    .line 15
    const-string v1, "kotlin.UByte"

    .line 16
    .line 17
    invoke-static {v0, v1}, La/ucx;->i(La/jiy;Ljava/lang/String;)La/scx;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, La/t1t0;->b:La/scx;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, La/t1t0;->b:La/scx;

    .line 2
    .line 3
    invoke-interface {p1, p0}, La/rkj;->y(La/ugi0;)La/rkj;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, La/rkj;->D()B

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    new-instance p1, La/p1t0;

    .line 12
    .line 13
    invoke-direct {p1, p0}, La/p1t0;-><init>(B)V

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/t1t0;->b:La/scx;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, La/p1t0;

    .line 2
    .line 3
    iget-byte p0, p2, La/p1t0;->a:B

    .line 4
    .line 5
    sget-object p2, La/t1t0;->b:La/scx;

    .line 6
    .line 7
    invoke-interface {p1, p2}, La/bwn;->A(La/ugi0;)La/bwn;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1, p0}, La/bwn;->h(B)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
