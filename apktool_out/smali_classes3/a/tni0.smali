.class public final La/tni0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pbt;


# direct methods
.method public constructor <init>(La/pbt;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/tni0;->a:La/pbt;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, La/tni0;->a:La/pbt;

    .line 2
    .line 3
    iget-object p0, p0, La/pbt;->a:La/j5t;

    .line 4
    .line 5
    iput-boolean p1, p0, La/j5t;->v:Z

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string p1, "bonusAccountAllowed"

    .line 12
    .line 13
    invoke-static {p0, p1}, La/j5t;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
