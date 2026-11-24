.class public final synthetic La/o7d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:La/bmf0;

.field public final synthetic b:La/gnf0;

.field public final synthetic c:J

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(La/bmf0;La/gnf0;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/o7d;->a:La/bmf0;

    iput-object p2, p0, La/o7d;->b:La/gnf0;

    iput-wide p3, p0, La/o7d;->c:J

    iput-wide p5, p0, La/o7d;->d:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-wide v2, p0, La/o7d;->c:J

    .line 2
    .line 3
    iget-wide v4, p0, La/o7d;->d:J

    .line 4
    .line 5
    iget-object v0, p0, La/o7d;->a:La/bmf0;

    .line 6
    .line 7
    iget-object v1, p0, La/o7d;->b:La/gnf0;

    .line 8
    .line 9
    invoke-interface/range {v0 .. v5}, La/bmf0;->v(La/gnf0;JJ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
