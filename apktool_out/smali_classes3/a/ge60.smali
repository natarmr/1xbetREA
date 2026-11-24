.class public final La/ge60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/dg80;


# static fields
.field public static final b:La/mb50;


# instance fields
.field public final a:La/fe60;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/mb50;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/mb50;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/ge60;->b:La/mb50;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(La/fe60;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ge60;->a:La/fe60;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final h0()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/ge60;->a:La/fe60;

    .line 2
    .line 3
    check-cast p0, La/lm40;

    .line 4
    .line 5
    iget-object p0, p0, La/lm40;->a:La/lm40;

    .line 6
    .line 7
    iget-boolean p0, p0, La/lm40;->n:Z

    .line 8
    .line 9
    return p0
.end method
