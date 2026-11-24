.class public final La/yni0;
.super La/g4;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;
.implements Ljava/io/Serializable;


# static fields
.field private static final b:La/xni0;

.field public static final c:La/yni0;


# instance fields
.field public final a:La/jo20;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/xni0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, La/xni0;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/yni0;->b:La/xni0;

    .line 8
    .line 9
    new-instance v0, La/yni0;

    .line 10
    .line 11
    sget-object v1, La/jo20;->n:La/fo20;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object v1, La/jo20;->o:La/jo20;

    .line 17
    .line 18
    invoke-direct {v0, v1}, La/yni0;-><init>(La/jo20;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, La/yni0;->c:La/yni0;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, La/jo20;

    .line 2
    .line 3
    invoke-direct {v0}, La/jo20;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/yni0;->a:La/jo20;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 14
    new-instance v0, La/jo20;

    invoke-direct {v0, p1}, La/jo20;-><init>(I)V

    .line 15
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 16
    iput-object v0, p0, La/yni0;->a:La/jo20;

    return-void
.end method

.method public constructor <init>(La/jo20;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 13
    iput-object p1, p0, La/yni0;->a:La/jo20;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/yni0;->a:La/jo20;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/jo20;->a(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-ltz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/yni0;->a:La/jo20;

    .line 5
    .line 6
    invoke-virtual {v0}, La/jo20;->d()V

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final b()I
    .locals 0

    .line 1
    iget-object p0, p0, La/yni0;->a:La/jo20;

    .line 2
    .line 3
    iget p0, p0, La/jo20;->i:I

    .line 4
    .line 5
    return p0
.end method

.method public final clear()V
    .locals 0

    .line 1
    iget-object p0, p0, La/yni0;->a:La/jo20;

    .line 2
    .line 3
    invoke-virtual {p0}, La/jo20;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/yni0;->a:La/jo20;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/jo20;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/yni0;->a:La/jo20;

    .line 2
    .line 3
    invoke-virtual {p0}, La/jo20;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget-object p0, p0, La/yni0;->a:La/jo20;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, La/go20;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, p0, v1}, La/go20;-><init>(La/jo20;B)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/yni0;->a:La/jo20;

    .line 2
    .line 3
    invoke-virtual {p0}, La/jo20;->d()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, La/jo20;->h(Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-gez p1, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_0
    invoke-virtual {p0, p1}, La/jo20;->m(I)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/yni0;->a:La/jo20;

    .line 5
    .line 6
    invoke-virtual {v0}, La/jo20;->d()V

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/yni0;->a:La/jo20;

    .line 5
    .line 6
    invoke-virtual {v0}, La/jo20;->d()V

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method
