.class public final synthetic La/p0g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/xex;

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(La/xex;JJJZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/p0g;->a:La/xex;

    iput-wide p2, p0, La/p0g;->b:J

    iput-wide p4, p0, La/p0g;->c:J

    iput-wide p6, p0, La/p0g;->d:J

    iput-boolean p8, p0, La/p0g;->e:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, La/k0w0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/p0g;->a:La/xex;

    .line 7
    .line 8
    iget-object v0, v0, La/xex;->b:Ljava/lang/Object;

    .line 9
    .line 10
    new-instance v1, Lorg/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;

    .line 11
    .line 12
    iget-wide v2, p0, La/p0g;->b:J

    .line 13
    .line 14
    iget-wide v4, p0, La/p0g;->d:J

    .line 15
    .line 16
    const-wide/16 v6, 0x28

    .line 17
    .line 18
    iget-wide v8, p0, La/p0g;->c:J

    .line 19
    .line 20
    const-string v10, ""

    .line 21
    .line 22
    iget-boolean v11, p0, La/p0g;->e:Z

    .line 23
    .line 24
    invoke-direct/range {v1 .. v11}, Lorg/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;-><init>(JJJJLjava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0
.end method
