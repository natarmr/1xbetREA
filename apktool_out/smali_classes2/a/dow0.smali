.class public final La/dow0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/atm0;

.field public final b:I

.field public final c:La/pfw;

.field public final d:I

.field public final e:Z

.field public final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(La/atm0;IIZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/dow0;->a:La/atm0;

    .line 5
    .line 6
    iput p2, p0, La/dow0;->b:I

    .line 7
    .line 8
    sget-object p1, La/jnw0;->a:[I

    .line 9
    .line 10
    invoke-static {p2}, La/hne;->E(I)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    aget p1, p1, p2

    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    if-eq p1, p2, :cond_1

    .line 18
    .line 19
    const/4 p2, 0x2

    .line 20
    if-eq p1, p2, :cond_0

    .line 21
    .line 22
    sget-object p1, La/pfw;->h:La/pfw;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object p1, La/pfw;->i:La/pfw;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    sget-object p1, La/pfw;->g:La/pfw;

    .line 29
    .line 30
    :goto_0
    iput-object p1, p0, La/dow0;->c:La/pfw;

    .line 31
    .line 32
    iput p3, p0, La/dow0;->d:I

    .line 33
    .line 34
    iput-boolean p4, p0, La/dow0;->e:Z

    .line 35
    .line 36
    iput-boolean p5, p0, La/dow0;->f:Z

    .line 37
    .line 38
    return-void
.end method
