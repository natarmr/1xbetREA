.class public final La/gdy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# static fields
.field public static final a:La/gdy;

.field public static final b:La/fdy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/gdy;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/gdy;->a:La/gdy;

    .line 7
    .line 8
    sget-object v0, La/fdy;->b:La/fdy;

    .line 9
    .line 10
    sput-object v0, La/gdy;->b:La/fdy;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, La/fww;->t(La/rkj;)La/icy;

    .line 2
    .line 3
    .line 4
    new-instance p0, La/edy;

    .line 5
    .line 6
    sget-object v0, La/jsm0;->a:La/jsm0;

    .line 7
    .line 8
    invoke-static {v0}, La/mrv;->o0(La/jsm0;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 12
    .line 13
    sget-object v1, La/qcy;->a:La/qcy;

    .line 14
    .line 15
    invoke-static {v0, v1}, La/mrv;->N(La/jiy;La/jiy;)La/inv;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, p1}, La/v1;->deserialize(La/rkj;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/util/Map;

    .line 24
    .line 25
    invoke-direct {p0, p1}, La/edy;-><init>(Ljava/util/Map;)V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/gdy;->b:La/fdy;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, La/edy;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, La/fww;->u(La/bwn;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, La/jsm0;->a:La/jsm0;

    .line 10
    .line 11
    invoke-static {p0}, La/mrv;->o0(La/jsm0;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, La/ysm0;->a:La/ysm0;

    .line 15
    .line 16
    sget-object v0, La/qcy;->a:La/qcy;

    .line 17
    .line 18
    invoke-static {p0, v0}, La/mrv;->N(La/jiy;La/jiy;)La/inv;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0, p1, p2}, La/inv;->serialize(La/bwn;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
