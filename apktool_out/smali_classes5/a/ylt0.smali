.class public final La/ylt0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ppu;

.field public final b:La/viu;


# direct methods
.method public constructor <init>(La/ppu;La/viu;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ylt0;->a:La/ppu;

    .line 5
    .line 6
    iput-object p2, p0, La/ylt0;->b:La/viu;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(ZLa/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, La/ylt0;->b:La/viu;

    .line 2
    .line 3
    invoke-virtual {v0}, La/viu;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x3e8

    .line 8
    .line 9
    div-long/2addr v0, v2

    .line 10
    iget-object p0, p0, La/ylt0;->a:La/ppu;

    .line 11
    .line 12
    iget-object p0, p0, La/ppu;->a:La/y1d0;

    .line 13
    .line 14
    invoke-virtual {p0, v0, v1, p2, p1}, La/y1d0;->b(JLa/zje;Z)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
