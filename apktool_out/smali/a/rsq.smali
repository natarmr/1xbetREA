.class public final La/rsq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, La/rsq;->b:Z

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, La/rsq;->a:Ljava/util/List;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, La/rsq;->b:Z

    .line 18
    iput-object p1, p0, La/rsq;->a:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Z)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/rsq;->a:Ljava/util/List;

    iput-boolean p2, p0, La/rsq;->b:Z

    return-void
.end method
