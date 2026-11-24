.class public final La/lyi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/ctf0;

.field public final c:La/yxi;


# direct methods
.method public constructor <init>(La/ctf0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/lyi;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p1, p0, La/lyi;->b:La/ctf0;

    .line 7
    .line 8
    new-instance p1, La/yxi;

    .line 9
    .line 10
    const/16 p2, 0xa

    .line 11
    .line 12
    invoke-direct {p1, p0, p2}, La/yxi;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/lyi;->c:La/yxi;

    .line 16
    .line 17
    return-void
.end method
