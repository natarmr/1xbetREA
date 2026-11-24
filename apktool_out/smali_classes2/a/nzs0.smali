.class public final La/nzs0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:La/nzs0;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/Map;

.field public final c:La/nzs0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/nzs0;

    .line 2
    .line 3
    sget-object v1, La/iun;->a:La/iun;

    .line 4
    .line 5
    sget-object v2, La/lun;->a:La/lun;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v0, v1, v2, v3}, La/nzs0;-><init>(Ljava/util/List;Ljava/util/Map;La/nzs0;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/nzs0;->d:La/nzs0;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/Map;La/nzs0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/nzs0;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, La/nzs0;->b:Ljava/util/Map;

    .line 7
    .line 8
    iput-object p3, p0, La/nzs0;->c:La/nzs0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(I)La/miy;
    .locals 2

    .line 1
    iget-object v0, p0, La/nzs0;->b:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, La/miy;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object p0, p0, La/nzs0;->c:La/nzs0;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, p1}, La/nzs0;->a(I)La/miy;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :cond_1
    return-object v0
.end method
