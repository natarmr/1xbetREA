.class public final La/n8a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gnf0;


# instance fields
.field public final a:La/lun;

.field public final b:La/cmf0;


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/lun;->a:La/lun;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/n8a;->a:La/lun;

    .line 10
    .line 11
    new-instance v1, La/cmf0;

    .line 12
    .line 13
    sget-object v2, La/iun;->a:La/iun;

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    const/16 v7, 0x3e

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    invoke-direct/range {v1 .. v7}, La/cmf0;-><init>(Ljava/util/List;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/ArrayList;La/onf0;I)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, La/n8a;->b:La/cmf0;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final H(La/sgy;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public final Q()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, La/n8a;->a:La/lun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final R()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final a(La/dd40;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public final b(La/dd40;La/eoo0;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p2
.end method

.method public final getRequest()La/cmf0;
    .locals 0

    .line 1
    iget-object p0, p0, La/n8a;->b:La/cmf0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final x()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    return-wide v0
.end method
