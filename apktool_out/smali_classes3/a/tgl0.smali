.class public final La/tgl0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/m4l0;


# direct methods
.method public constructor <init>(La/m4l0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/tgl0;->a:La/m4l0;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(JLa/zje;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object p0, p0, La/tgl0;->a:La/m4l0;

    .line 2
    .line 3
    iget-object p0, p0, La/m4l0;->a:La/zdg0;

    .line 4
    .line 5
    new-instance v0, La/hu6;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/16 v2, 0xa

    .line 9
    .line 10
    invoke-direct {v0, p1, p2, v1, v2}, La/hu6;-><init>(JLa/yje;B)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-static {p3, p0, v0, p1, p2}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
