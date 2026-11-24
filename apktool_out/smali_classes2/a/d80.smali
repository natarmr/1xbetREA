.class public final La/d80;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/p7m0;

.field public b:La/z70;

.field public c:La/esr;

.field public d:La/o80;

.field public e:F


# direct methods
.method public constructor <init>()V
    .locals 13

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/iun;->a:La/iun;

    .line 5
    .line 6
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/d80;->a:La/p7m0;

    .line 11
    .line 12
    sget-object v0, La/z70;->v:La/z70;

    .line 13
    .line 14
    iput-object v0, p0, La/d80;->b:La/z70;

    .line 15
    .line 16
    sget-object v0, La/esr;->c:La/esr;

    .line 17
    .line 18
    iput-object v0, p0, La/d80;->c:La/esr;

    .line 19
    .line 20
    new-instance v1, La/o80;

    .line 21
    .line 22
    const/4 v11, 0x0

    .line 23
    const/16 v12, 0x7f

    .line 24
    .line 25
    const-wide/16 v2, 0x0

    .line 26
    .line 27
    const-wide/16 v4, 0x0

    .line 28
    .line 29
    const-wide/16 v6, 0x0

    .line 30
    .line 31
    const-wide/16 v8, 0x0

    .line 32
    .line 33
    const/4 v10, 0x0

    .line 34
    invoke-direct/range {v1 .. v12}, La/o80;-><init>(JDDDLa/yeg0;Ljava/util/ArrayList;I)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, La/d80;->d:La/o80;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, La/d80;->a:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/Collection;

    .line 8
    .line 9
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->N0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
