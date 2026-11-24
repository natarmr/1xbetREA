.class public final synthetic La/h8f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:La/j8f;

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/j8f;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/h8f;->a:La/j8f;

    iput-wide p2, p0, La/h8f;->b:J

    iput-object p4, p0, La/h8f;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, La/h8f;->a:La/j8f;

    .line 2
    .line 3
    iget-object v1, v0, La/j8f;->o:La/cu;

    .line 4
    .line 5
    iget-object v1, v1, La/cu;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/aaf;

    .line 8
    .line 9
    new-instance v2, La/tx9;

    .line 10
    .line 11
    iget-wide v3, p0, La/h8f;->b:J

    .line 12
    .line 13
    iget-object p0, p0, La/h8f;->c:Ljava/lang/String;

    .line 14
    .line 15
    invoke-direct {v2, v0, v3, v4, p0}, La/tx9;-><init>(La/j8f;JLjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, La/aaf;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
