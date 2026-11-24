.class public final La/ci90;
.super La/d5;
.source "SourceFile"

# interfaces
.implements La/h4x;
.implements Ljava/util/Collection;
.implements La/khy;


# static fields
.field public static final e:La/ci90;


# instance fields
.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:La/eh90;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/ci90;

    .line 2
    .line 3
    sget-object v1, La/jtv;->h:La/jtv;

    .line 4
    .line 5
    sget-object v2, La/eh90;->f:La/eh90;

    .line 6
    .line 7
    invoke-direct {v0, v1, v1, v2}, La/ci90;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/eh90;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, La/ci90;->e:La/ci90;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;La/eh90;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ci90;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/ci90;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, La/ci90;->d:La/eh90;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b()I
    .locals 0

    .line 1
    iget-object p0, p0, La/ci90;->d:La/eh90;

    .line 2
    .line 3
    iget p0, p0, La/eh90;->e:I

    .line 4
    .line 5
    return p0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/ci90;->d:La/eh90;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/eh90;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    new-instance v0, La/ai90;

    .line 2
    .line 3
    iget-object v1, p0, La/ci90;->d:La/eh90;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    iget-object p0, p0, La/ci90;->b:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {v0, p0, v1, v2}, La/ai90;-><init>(Ljava/lang/Object;Ljava/util/Map;B)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
