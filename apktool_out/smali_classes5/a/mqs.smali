.class public final La/mqs;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/vzg0;

.field public final b:J

.field public final c:Z

.field public final d:J

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/vzg0;JZJ)V
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
    iput-object p1, p0, La/mqs;->a:La/vzg0;

    .line 8
    .line 9
    iput-wide p2, p0, La/mqs;->b:J

    .line 10
    .line 11
    iput-boolean p4, p0, La/mqs;->c:Z

    .line 12
    .line 13
    iput-wide p5, p0, La/mqs;->d:J

    .line 14
    .line 15
    const-string p1, "game_id_key"

    .line 16
    .line 17
    invoke-static {p2, p3, p1}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, La/mqs;->e:Ljava/lang/String;

    .line 22
    .line 23
    const-string p1, "game_state_key"

    .line 24
    .line 25
    invoke-static {p2, p3, p1}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, La/mqs;->f:Ljava/lang/String;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a(JZZZ)V
    .locals 1

    .line 1
    iget-object v0, p0, La/mqs;->e:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p0, La/mqs;->a:La/vzg0;

    .line 8
    .line 9
    invoke-virtual {p2, v0, p1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, La/t3z;->a:La/rqt;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {p3, p4, p5}, La/rqt;->h(ZZZ)La/t3z;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object p0, p0, La/mqs;->f:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p2, p0, p1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
