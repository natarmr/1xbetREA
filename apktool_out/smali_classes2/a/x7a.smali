.class public final La/x7a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:B


# instance fields
.field public final a:La/dfv;

.field public final b:La/q99;

.field public final c:La/itb;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/dfv;->C:La/c6z;

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    sput-byte v0, La/x7a;->d:B

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(La/dfv;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/x7a;->a:La/dfv;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    const/4 v0, 0x6

    .line 11
    const v1, 0x7fffffff

    .line 12
    .line 13
    .line 14
    invoke-static {v1, p1, p1, v0}, La/vtb;->d(ILa/i99;Lkotlin/jvm/functions/Function1;I)La/q99;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, La/x7a;->b:La/q99;

    .line 19
    .line 20
    invoke-static {p1}, La/xkb;->V(La/htb;)La/itb;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, La/x7a;->c:La/itb;

    .line 25
    .line 26
    return-void
.end method
