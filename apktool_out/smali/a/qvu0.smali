.class public final synthetic La/qvu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:La/m9c;

.field public final synthetic b:Z

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(La/m9c;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qvu0;->a:La/m9c;

    iput-boolean p2, p0, La/qvu0;->b:Z

    iput-boolean p3, p0, La/qvu0;->c:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, La/qvu0;->a:La/m9c;

    .line 2
    .line 3
    iget-object v0, v0, La/m9c;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/hcp0;

    .line 6
    .line 7
    iget-boolean v1, p0, La/qvu0;->b:Z

    .line 8
    .line 9
    iget-boolean p0, p0, La/qvu0;->c:Z

    .line 10
    .line 11
    invoke-virtual {v0, v1, p0}, La/hcp0;->v(ZZ)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
