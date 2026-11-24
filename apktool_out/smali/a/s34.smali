.class public final La/s34;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:La/s34;


# instance fields
.field public final a:J

.field public final b:La/bmq0;

.field public final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/r34;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, La/r34;-><init>(B)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, La/r34;->d()La/s34;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, La/s34;->d:La/s34;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(La/r34;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p1, La/r34;->a:J

    .line 5
    .line 6
    iput-wide v0, p0, La/s34;->a:J

    .line 7
    .line 8
    iget-object v0, p1, La/r34;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, La/bmq0;

    .line 11
    .line 12
    iput-object v0, p0, La/s34;->b:La/bmq0;

    .line 13
    .line 14
    iget-object p1, p1, La/r34;->c:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p1, p0, La/s34;->c:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method
