.class public final La/yxv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:La/vmu0;

.field public final b:La/qoj0;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/i99;->b:La/i99;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-static {v2, v3, v0, v1}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/yxv;->b:La/qoj0;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(La/vmu0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/yxv;->a:La/vmu0;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/yxv;->b:La/qoj0;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
