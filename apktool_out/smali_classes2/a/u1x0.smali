.class public final La/u1x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:La/r1x0;

.field public final synthetic b:La/r1x0;

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:La/c2x0;


# direct methods
.method public constructor <init>(La/c2x0;La/r1x0;La/r1x0;JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/u1x0;->a:La/r1x0;

    .line 5
    .line 6
    iput-object p3, p0, La/u1x0;->b:La/r1x0;

    .line 7
    .line 8
    iput-wide p4, p0, La/u1x0;->c:J

    .line 9
    .line 10
    iput-boolean p6, p0, La/u1x0;->d:Z

    .line 11
    .line 12
    iput-object p1, p0, La/u1x0;->e:La/c2x0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-boolean v5, p0, La/u1x0;->d:Z

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    iget-object v0, p0, La/u1x0;->e:La/c2x0;

    .line 5
    .line 6
    iget-object v1, p0, La/u1x0;->a:La/r1x0;

    .line 7
    .line 8
    iget-object v2, p0, La/u1x0;->b:La/r1x0;

    .line 9
    .line 10
    iget-wide v3, p0, La/u1x0;->c:J

    .line 11
    .line 12
    invoke-virtual/range {v0 .. v6}, La/c2x0;->r1(La/r1x0;La/r1x0;JZLandroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
