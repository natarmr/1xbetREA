.class public final La/rbz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ljava/util/ArrayList;

.field public final synthetic c:La/tbz;


# direct methods
.method public constructor <init>(La/tbz;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/rbz;->c:La/tbz;

    .line 5
    .line 6
    iput p2, p0, La/rbz;->a:I

    .line 7
    .line 8
    new-instance p1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/rbz;->b:Ljava/util/ArrayList;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 4

    .line 1
    iget-object v0, p0, La/rbz;->c:La/tbz;

    .line 2
    .line 3
    iget-object v1, v0, La/tbz;->c:La/o24;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, v0, La/tbz;->b:La/nvu;

    .line 9
    .line 10
    new-instance v2, La/ktb0;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-direct {v2, v1, p1, v0, v3}, La/ktb0;-><init>(La/o24;ILa/nvu;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/rbz;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method
