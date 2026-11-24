.class public final La/u6q0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/djz;

.field public final b:La/k7q0;

.field public final c:La/a8q0;

.field public final d:Z

.field public final e:Z

.field public final f:La/n9q0;

.field public final g:La/qe60;

.field public final h:La/q7t0;

.field public final i:La/vij;

.field public final j:Lkotlin/jvm/functions/Function1;

.field public final k:I


# direct methods
.method public constructor <init>(La/djz;La/k7q0;La/a8q0;ZZLa/n9q0;La/qe60;La/q7t0;La/vij;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/u6q0;->a:La/djz;

    .line 5
    .line 6
    iput-object p2, p0, La/u6q0;->b:La/k7q0;

    .line 7
    .line 8
    iput-object p3, p0, La/u6q0;->c:La/a8q0;

    .line 9
    .line 10
    iput-boolean p4, p0, La/u6q0;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, La/u6q0;->e:Z

    .line 13
    .line 14
    iput-object p6, p0, La/u6q0;->f:La/n9q0;

    .line 15
    .line 16
    iput-object p7, p0, La/u6q0;->g:La/qe60;

    .line 17
    .line 18
    iput-object p8, p0, La/u6q0;->h:La/q7t0;

    .line 19
    .line 20
    iput-object p9, p0, La/u6q0;->i:La/vij;

    .line 21
    .line 22
    iput-object p10, p0, La/u6q0;->j:Lkotlin/jvm/functions/Function1;

    .line 23
    .line 24
    iput p11, p0, La/u6q0;->k:I

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/u6q0;->a:La/djz;

    .line 2
    .line 3
    iget-object v0, v0, La/djz;->d:La/hsj;

    .line 4
    .line 5
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->N0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v1, La/bfq;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {p1, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, La/hsj;->b(Ljava/util/List;)La/a8q0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p0, p0, La/u6q0;->j:Lkotlin/jvm/functions/Function1;

    .line 23
    .line 24
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void
.end method
