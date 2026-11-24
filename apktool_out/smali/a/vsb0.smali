.class public final La/vsb0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/aeg0;

.field public final b:La/f7k;


# direct methods
.method public constructor <init>(La/aeg0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/vsb0;->a:La/aeg0;

    .line 5
    .line 6
    new-instance p1, La/f7k;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p1, v0}, La/f7k;-><init>(B)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/vsb0;->b:La/f7k;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/Long;
    .locals 2

    .line 1
    new-instance v0, La/ka6;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, La/ka6;-><init>(Ljava/lang/String;B)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/vsb0;->a:La/aeg0;

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {p0, p1, v1, v0}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/lang/Long;

    .line 17
    .line 18
    return-object p0
.end method
