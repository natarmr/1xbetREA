.class public final La/djj;
.super La/ivb0;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final d:La/au20;


# direct methods
.method public constructor <init>(La/au20;)V
    .locals 1

    .line 1
    sget-object v0, La/ymx;->b:La/ymx;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/djj;->d:La/au20;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    sget-wide v2, La/ivb0;->c:J

    .line 9
    .line 10
    sub-long v2, v0, v2

    .line 11
    .line 12
    sget-object v4, La/ymx;->b:La/ymx;

    .line 13
    .line 14
    const-wide/16 v4, 0x1f4

    .line 15
    .line 16
    cmp-long v2, v2, v4

    .line 17
    .line 18
    if-lez v2, :cond_0

    .line 19
    .line 20
    sput-wide v0, La/ivb0;->c:J

    .line 21
    .line 22
    iput-wide v0, p0, La/ivb0;->a:J

    .line 23
    .line 24
    iget-object p0, p0, La/djj;->d:La/au20;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, La/au20;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    return p0
.end method
