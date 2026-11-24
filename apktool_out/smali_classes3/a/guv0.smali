.class public final La/guv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/y1h0;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:La/iun;

.field public final c:La/iun;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
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
    iput-object p1, p0, La/guv0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object p1, La/iun;->a:La/iun;

    .line 10
    .line 11
    iput-object p1, p0, La/guv0;->b:La/iun;

    .line 12
    .line 13
    iput-object p1, p0, La/guv0;->c:La/iun;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/guv0;->c:La/iun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/guv0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/guv0;

    .line 12
    .line 13
    iget-object p0, p0, La/guv0;->a:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object p1, p1, La/guv0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
.end method

.method public final getContent()La/ugd;
    .locals 0

    .line 1
    sget-object p0, La/aad;->j:La/ugd;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getEntries()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/guv0;->b:La/iun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/guv0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, La/guv0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "XBottomSheetHiddenScene(key="

    .line 2
    .line 3
    const-string v1, ")"

    .line 4
    .line 5
    iget-object p0, p0, La/guv0;->a:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {p0, v0, v1}, La/f140;->k(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
