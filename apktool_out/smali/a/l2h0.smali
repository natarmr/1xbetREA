.class public final synthetic La/l2h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zjo;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:Landroidx/work/impl/WorkDatabase;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:La/wsd;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Landroidx/work/impl/WorkDatabase;Ljava/util/List;La/wsd;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/l2h0;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, La/l2h0;->b:Landroidx/work/impl/WorkDatabase;

    iput-object p3, p0, La/l2h0;->c:Ljava/util/List;

    iput-object p4, p0, La/l2h0;->d:La/wsd;

    return-void
.end method


# virtual methods
.method public final c(La/xov0;Z)V
    .locals 6

    .line 1
    new-instance v0, La/qx9;

    .line 2
    .line 3
    const/16 v5, 0x8

    .line 4
    .line 5
    iget-object v1, p0, La/l2h0;->b:Landroidx/work/impl/WorkDatabase;

    .line 6
    .line 7
    iget-object v3, p0, La/l2h0;->c:Ljava/util/List;

    .line 8
    .line 9
    iget-object v4, p0, La/l2h0;->d:La/wsd;

    .line 10
    .line 11
    move-object v2, p1

    .line 12
    invoke-direct/range {v0 .. v5}, La/qx9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/l2h0;->a:Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
