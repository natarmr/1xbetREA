.class public final synthetic La/m0c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/m0c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "a"
.end annotation


# static fields
.field public static final INSTANCE:La/m0c$a;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/m0c$a;

    .line 2
    .line 3
    invoke-direct {v0}, La/m0c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/m0c$a;->INSTANCE:La/m0c$a;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.domain.resolver.api.data.model.CheckDomainAvailableResponse"

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "available"

    .line 17
    .line 18
    invoke-virtual {v1, v0, v3}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    sput-object v1, La/m0c$a;->descriptor:La/ugi0;

    .line 22
    .line 23
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "La/jiy;"
        }
    .end annotation

    .line 1
    sget-object p0, La/sm8;->a:La/sm8;

    .line 2
    .line 3
    invoke-static {p0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x1

    .line 8
    new-array v0, v0, [La/jiy;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    aput-object p0, v0, v1

    .line 12
    .line 13
    return-object v0
.end method

.method public final deserialize(La/rkj;)La/m0c;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, La/m0c$a;->descriptor:La/ugi0;

    .line 5
    .line 6
    invoke-interface {p1, p0}, La/rkj;->a(La/ugi0;)La/bld;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x1

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v0

    .line 14
    move v4, v1

    .line 15
    move-object v5, v2

    .line 16
    :goto_0
    if-eqz v3, :cond_2

    .line 17
    .line 18
    invoke-interface {p1, p0}, La/bld;->f(La/ugi0;)I

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    const/4 v7, -0x1

    .line 23
    if-eq v6, v7, :cond_1

    .line 24
    .line 25
    if-nez v6, :cond_0

    .line 26
    .line 27
    sget-object v4, La/sm8;->a:La/sm8;

    .line 28
    .line 29
    invoke-interface {p1, p0, v1, v4, v5}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    move-object v5, v4

    .line 34
    check-cast v5, Ljava/lang/Boolean;

    .line 35
    .line 36
    move v4, v0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-static {v6}, La/itt0;->c(I)V

    .line 39
    .line 40
    .line 41
    return-object v2

    .line 42
    :cond_1
    move v3, v1

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-interface {p1, p0}, La/bld;->c(La/ugi0;)V

    .line 45
    .line 46
    .line 47
    new-instance p0, La/m0c;

    .line 48
    .line 49
    invoke-direct {p0, v4, v5, v2}, La/m0c;-><init>(ILjava/lang/Boolean;La/ehi0;)V

    .line 50
    .line 51
    .line 52
    return-object p0
.end method

.method public bridge synthetic deserialize(La/rkj;)Ljava/lang/Object;
    .locals 0

    .line 53
    invoke-virtual {p0, p1}, La/m0c$a;->deserialize(La/rkj;)La/m0c;

    move-result-object p0

    return-object p0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/m0c$a;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;La/m0c;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p0, La/m0c$a;->descriptor:La/ugi0;

    .line 8
    .line 9
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p2, p1, p0}, La/m0c;->write$Self$org_xplatform_secret_resolver_api(La/m0c;La/cld;La/ugi0;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public bridge synthetic serialize(La/bwn;Ljava/lang/Object;)V
    .locals 0

    .line 20
    check-cast p2, La/m0c;

    invoke-virtual {p0, p1, p2}, La/m0c$a;->serialize(La/bwn;La/m0c;)V

    return-void
.end method

.method public bridge typeParametersSerializers()[La/jiy;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "La/jiy;"
        }
    .end annotation

    .line 1
    sget-object p0, La/lv00;->k:[La/jiy;

    .line 2
    .line 3
    return-object p0
.end method
